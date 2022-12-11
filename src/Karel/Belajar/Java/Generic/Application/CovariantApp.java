package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData <String> stringMyData = new MyData<>("karel");
        process(stringMyData);

        MyData <? extends Object> myData = stringMyData; // tidak akan error

        MyData <? extends Object> objectMyData = new MyData<>(100);
    }

    public static void process(MyData <? extends Object> myData) {
        Object object = myData.getData();
        System.out.println(object);

        // myData.setData("indonesia"); TIDAK BOLEH MERUBAH DATA KARENA MENYEBABKAN ERROR
    }
}
