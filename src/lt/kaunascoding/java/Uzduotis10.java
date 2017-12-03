package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis10 {
    Uzduotis10() {
        System.out.println("Iveskite du sveikus skaicius:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Suma(a, b));
        System.out.println(Skirtumas(a, b));
        System.out.println(Sandauga(a, b));

    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static int Skirtumas(int a, int b) {
        return a - b;
    }

    public static int Sandauga(int a, int b) {
        return a * b;
    }
}