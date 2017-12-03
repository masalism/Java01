package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis06 {
    public Uzduotis06() {
        System.out.println("Iveskite savo mase (kg) ir ugi (m)");
        Scanner sc = new Scanner(System.in);
        float mase = sc.nextFloat();
        float ugis = sc.nextFloat();
        float kmi = mase / (ugis * ugis);
        System.out.println("Jusu kmi: " + kmi);
    }
}
