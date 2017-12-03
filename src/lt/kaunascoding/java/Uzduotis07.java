package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis07 {
    public Uzduotis07() {
        System.out.println("Iveskite savo mase (kg) ir ugi (m)");
        Scanner sc = new Scanner(System.in);
        float mase = sc.nextFloat();
        float ugis = sc.nextFloat();
        System.out.println("Jusu kmi: " + KMI(mase, ugis));
    }

    public static float KMI(float mase, float ugis) {
        return mase / (ugis * ugis);
    }
}
