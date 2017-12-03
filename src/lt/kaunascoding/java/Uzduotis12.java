package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis12 {
    public double ugis;
    public double mase;

    public Uzduotis12() {
        System.out.println("Iveskite savo ugi ir mase: ");
        Scanner sc = new Scanner(System.in);
        ugis = sc.nextDouble();
        mase = sc.nextDouble();
        Skaiciuotuvas sk = new Skaiciuotuvas();
        System.out.println("Kmi: " + sk.KMIskai());
    }

    //klase tik KMI skaiciavimui
    private class Skaiciuotuvas {
        public double KMIskai() {
            return mase / Math.pow(ugis, 2);
        }
    }
}
