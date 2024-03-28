package com.perscholas.java_basics;
class Monster {
    private final String name;
    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}

class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}

class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
public class TestMonster {
    // Given main
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast
        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()
        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()
        // We have a problem here!!!
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());  // garbage!!!
    }
}

/*
Output:
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=64074:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/xiwu/Desktop/tek_java/out/production/tek_java com.perscholas.java_basics.TestMonster
Attack with fire!
Attack with water!
Attack with stones!
Attack with stones!
!^_&^$@+%$* I don't know how to attack!

Process finished with exit code 0

 */