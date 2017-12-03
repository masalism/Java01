package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis04 {
    public Uzduotis04(){
        System.out.println("Iveskite du skaicius");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(Suma(a,b));
        System.out.println(Skirtumas(a,b));
    }

    public static float Suma (float a, float b){
        return a+b;
    }

    public static float Skirtumas (float a, float b){
        return a-b;
    }
}
