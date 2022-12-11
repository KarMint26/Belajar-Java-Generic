package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Karel");
        sayHello(stringMyData.getData());
        /// MyData<Object> objectMyData = stringMyData; // ERROR karena terkena Invariant
        // doIt(stringMyData); ERROR karena generic method harus <String> bukan Object

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; ERROR
        // doItInteger(objectMyData); hasilnya ERROR

    }

    public static void sayHello(Object data){
        System.out.println("Hello Welcome to Indonesia Mr." + data); // Bukan Method generic tidak akan error
    }

    public static void doIt(MyData<Object> objectMyData) { // Method Generic akan Error
        // do anything
    }

    public static void doItInteger(MyData<Integer> integerMyData) { // Method Generic akan Error
        // do anything
    }
}
