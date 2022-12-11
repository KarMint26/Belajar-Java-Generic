package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Karel", "Indonesia"),
                new Person("Leonor", "Spain"),
                new Person("Lydia", "France")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
