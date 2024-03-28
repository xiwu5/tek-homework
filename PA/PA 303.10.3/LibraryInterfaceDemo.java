package com.perscholas.java_basics;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers();

        System.out.println("Test case 1:");
        kid.age = 10;
        kid.registerAccount();
        kid.bookType = "Kids";
        kid.requestBook();

        System.out.println("\nTest case 2:");
        kid.age = 18;
        kid.registerAccount();
        kid.bookType = "Fiction";
        kid.requestBook();

        AdultUser adult = new AdultUser();

        System.out.println("Test case 1:");
        adult.age = 5;
        adult.registerAccount();
        adult.bookType = "Kids";
        adult.requestBook();

        // Test case 2: age = 23, bookType = "Fiction"
        System.out.println("\nTest case 2:");
        adult.age = 23;
        adult.registerAccount();
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}

/*
Output:
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=64358:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/xiwu/Desktop/tek_java/out/production/tek_java com.perscholas.java_basics.LibraryInterfaceDemo
Test case 1:
You have successfully registered under a Kids Account
Book issued successfully, please return the book within 10 days

Test case 2:
Sorry, age must be less than 12 to register as a kid.
Oops, you are allowed to take only kids books
Test case 1:
Sorry, age must be greater than 12 to register as an adult.
Oops, you are allowed to take only adult Fiction books

Test case 2:
You have successfully registered under an Adult Account
Book issued successfully, please return the book within 7 days

Process finished with exit code 0

 */
