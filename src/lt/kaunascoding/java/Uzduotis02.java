package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis02 {
    public Uzduotis02(){
        System.out.println("Iveskite zodi");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        System.out.println("Jusu zodyje yra raidziu: " + zodis.length());
    }
}
