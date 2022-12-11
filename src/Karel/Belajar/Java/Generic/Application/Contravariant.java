package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.MyData;

public class Contravariant {

    public static void main(String[] args) {

        /// MyData <Object> objectMyData = new MyData<>("INDONESIA");
        // MyData <? super String> myData = objectMyData;
        MyData <? super String> objectMyData = new MyData<Object>("INDONESIA");
        // objectMyData.setData(1000); Tidak bisa langsung meng set jadi Integer, dia akan error
        process(objectMyData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData <? super String> myData) {
        Object value = myData.getData();
        System.out.println("Process Parameter " + value);
    }

}
