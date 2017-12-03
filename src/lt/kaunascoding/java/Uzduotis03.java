package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis03 {
    public Uzduotis03() {
        System.out.println("Iveskite du skaicius");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Skirtumas: " + (a - b));
        System.out.println("Suma: " + (a + b));
    }
}
