package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis13 {

    public Uzduotis13() {

        Skaiciavimai skaic = new Skaiciavimai();
        System.out.println("Iveskite skaiciu: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Kvadratas " + a + "=" + skaic.Kvadratu(a));
        System.out.println();

        System.out.println("iveskite staciakampio 2 krastines");
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("Staciakampio kvadratas = " + skaic.StacKvad(b, c));
        System.out.println();

        System.out.println("Iveskite stacjo trikampio dvi krastines, kad apskaiciuoti plota:");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("Trikampio plotas: " + skaic.TriPlotas(d, e));
        System.out.println();

        System.out.println("Iveskite apskritimo spinduli: ");
        float f = sc.nextFloat();
        System.out.println("Apskritimo plotas: " + skaic.apskritimas(f));

    }


    class Skaiciavimai {

        public double Kvadratu(float a) {
            return Math.pow(a, 2);
        }

        public float StacKvad(float b, float c) {
            return b * c;
        }

        public float TriPlotas(float d, float e) {
            return (d * e) / 2;
        }

        public float apskritimas(float f) {
            float pi = 3.1415f;
            return pi * f * f;


        }
    }
}