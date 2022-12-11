package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        MyData <String> stringMyData = new MyData<>("Welcome To Indonesia");
        MyData <Integer> integerMyData = new MyData<>(17);
        MyData <Boolean> booleanMyData = new MyData<>(true);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
        System.out.println(booleanMyData.getData());

    }

}
