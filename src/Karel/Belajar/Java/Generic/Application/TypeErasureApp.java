package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData<String> myData = new MyData<>("Karel");
        //// MyData myData = new MyData<>("Karel"); // jangan menghilangkan Type Genericnya.
        /// MyData<Integer> integerMyData = (MyData<Integer>) myData; // ERROR
        // Integer integer = integerMyData.getData();

    }
}
