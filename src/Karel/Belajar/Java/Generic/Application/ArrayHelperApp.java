package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.Util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] myName = { "Yohanes", "Karel", "Trisnanto", "Utomo" };
        Integer[] myBirthday = { 26, 11, 2003 };

        System.out.println("\nMy String Array Length is : " + ArrayHelper.count(myName));
        System.out.println("My Integer Array Length is : " + ArrayHelper.count(myBirthday));

    }

}
