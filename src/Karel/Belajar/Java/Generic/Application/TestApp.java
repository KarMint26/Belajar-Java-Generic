package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.Test;

public class TestApp {

    public static void main(String[] args) {

        Test <Integer, String> mytest = new Test<>(20, "Karel Trisnanto Utomo");

        mytest.myFirstMethod("Florentina");

        String name = Test.mySecondMethod("Your Name is");
        System.out.println("My Name is : " + name);

        int age = Integer.parseInt(Test.mySecondMethod(200));
        System.out.println("My Age is : " + age);

    }

}
