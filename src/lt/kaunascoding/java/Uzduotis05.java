package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis05 {
    public Uzduotis05() {
        System.out.println("Iveskite du skaicius");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(Suma(a, b));
        System.out.println(Skirtumas(a, b));
        System.out.println(Suma((int) a, (int) b));
        System.out.println(Skirtumas((int) a, (int) b));
    }

    public static float Suma(float a, float b) {
        return a + b;
    }

    public static float Skirtumas(float a, float b) {
        return a - b;
    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static int Skirtumas(int a, int b) {
        return a - b;
    }
}
