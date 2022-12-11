package Karel.Belajar.Java.Generic;

import java.util.Scanner;

public class Test<A, T> {

    public static Scanner scanner = new Scanner(System.in);

    private A firstTest;
    private T secondTest;

    public Test(A firstTest, T secondTest) {
        this.firstTest = firstTest;
        this.secondTest = secondTest;
    }

    public A getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(A firstTest) {
        this.firstTest = firstTest;
    }

    public T getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(T secondTest) {
        this.secondTest = secondTest;
    }

    public void myFirstMethod(T secondTest){
        System.out.println("Welcome To Switzerland " + secondTest + " My Name is " + this.secondTest);
    }

    public static <X> String mySecondMethod(X index){
        System.out.print(index + " : ");
        return scanner.next();
    }
}
