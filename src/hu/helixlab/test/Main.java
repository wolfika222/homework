package hu.helixlab.test;

public class Main {

    public static void main(String[] args) {
        // felveszek 2 short változót a téglalap két oldalának tárolására

        short a = 5;
        short b = 4;

        System.out.println("A téglalap területe: " + a * b + " cm^2");
        System.out.println("A téglalap kerülete: " + (a + b) * 2 + " cm\n");

         /* deciliteres feladat
        felveszek egy double típusú változót a deciliternek
         */

        double dl = 20.0D;

        System.out.println(dl + " dl = " + dl * 100 + " ml");
        System.out.println(dl + " dl = " + dl * 10 + " cl");
        System.out.println(dl + " dl = " + dl / 10 + " l");
        System.out.println(dl + " dl = " + dl / 1000 + " hl\n");

        //felveszek egy short változó a gömb sugarára és egy konstans a PI-nek

        short r = 5;
        final float PI = 3.14F;

        System.out.println("A " + r + " sugarú gömb térfogata: " + 4 * PI * Math.pow(r, 3) / 3 + "\n");

        // felveszek két double változót a celsius és a fahreinheit tárolására

        double fahreinheit = 10;
        double celsius = 5;

        System.out.println(fahreinheit + " fahreinheit = " + (fahreinheit - 32) / 9 * 5 + " celsius");
        System.out.println(celsius + " celsius = " + (celsius / 5 * 9 + 32) + " fahreinheit\n");

        System.out.println("**********\n*Hello\t*\n*World\t*\n*in\t\t*\n*a\t\t*\n*frame\t*\n**********\n");

        // felveszek egy char típusú változót és egy int változót


        char c = 'B';
        int d = c;

        System.out.println("A " + c + " karakter ASCII kódja: " + d);
    }
}
