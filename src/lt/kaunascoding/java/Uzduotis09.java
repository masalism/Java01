package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis09 {
    public float kelias;
    public float sanaudos;

    public Uzduotis09() {
        System.out.println("Iveskite kiek sudeginote kuro ir nuvaziuota atstuma km:");
        Scanner sc = new Scanner(System.in);
        sanaudos = sc.nextFloat();
        kelias = sc.nextFloat();
        Isvedimas();
        float sanaudos100km = (sanaudos * 100) / kelias;
        System.out.println("Sanaudos 100 km: " + sanaudos100km);
    }

    public void Isvedimas() {
        System.out.println("Jus nuvaziavote " + kelias + " ir sudeginote degalu: " + sanaudos);
    }

    public float sanaudos100km() {
        return (sanaudos * 100) / kelias;
    }
}
