package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis08 {
    public Uzduotis08(){
        System.out.println("Iveskite kiek sudeginote kuro ir nuvaziuota atstuma km:");
        Scanner sc = new Scanner(System.in);
        float sanaudos = sc.nextFloat();
        float kelias = sc.nextFloat();
        float sanaudos100km = (sanaudos*100)/kelias;
        System.out.println(sanaudos100km);
    }
}
