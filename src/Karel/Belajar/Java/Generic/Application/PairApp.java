package Karel.Belajar.Java.Generic.Application;

import Karel.Belajar.Java.Generic.Pair;

public class PairApp {

    public static void main(String[] args) {

        Pair <String, Integer> myPair = new Pair<>("Karel Trisnanto Utomo", 18);
        Pair <Double, Float> myPair2 = new Pair<>(12.54, 115.4f);

        String stringPairValue = myPair.getFirst();
        Integer integerPairValue = myPair.getSecond();

        Double doublePairValue = myPair2.getFirst();
        Float floatPairValue = myPair2.getSecond();

        System.out.println("\nIni Adalah Pair Object ke-1");
        System.out.println("Ini adalah first variable dari Generic Class : " + stringPairValue);
        System.out.println("Ini adalah second variable dari Generic Class ; " + integerPairValue);

        System.out.println("\nIni adalah Pair Object ke-2");
        System.out.println("Ini adalah first variable dari Generic Class : " + doublePairValue);
        System.out.println("Ini adalah second variable dari Generic Class : " + floatPairValue);

    }

}
