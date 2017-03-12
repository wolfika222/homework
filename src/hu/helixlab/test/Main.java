package hu.helixlab.test;

public class Main {

    public static void main(String[] args) {
        // felveszek 2 short változót a téglalap két oldalának tárolására

        short a = 5;
        short b = 4;

        System.out.println("A téglalap területe: " + a * b + " cm^2");
        System.out.println("A téglalap kerülete: " + (a + b) * 2 + " cm\n");

         /* deciliteres feladat
        felveszek egy short típusú változót a deciliternek
         */

        short dl = 20;

        System.out.println(dl + " dl = " + dl * 100 + " ml");
        System.out.println(dl + " dl = " + dl * 10 + " cl");
        System.out.println(dl + " dl = " + dl / 10 + " l");
        System.out.println(dl + " dl = " + dl / 1000 + " hl\n");

    }
}
