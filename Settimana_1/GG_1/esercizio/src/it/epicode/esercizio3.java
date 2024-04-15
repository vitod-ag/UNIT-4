package it.epicode;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**esercizio#3pt1**\n");
        System.out.println("Digita la base del rettangolo: ");
        float base = scanner.nextFloat();
        System.out.println("Digita l'altezza del rettangolo: ");
        float altezza = scanner.nextFloat();
        //
        System.out.println("Il perimetro del rettangolo in questione è: " + perimetroRettangolo(base, altezza));
        System.out.println("**esercizio#3pt2**\n");
        System.out.println("Digita un intero e scopriamo se è pari(0) o dispari(1):");
        int numero = scanner.nextInt();
        System.out.println("Il numero " + numero + " è : " + pariDispari(numero));
        System.out.println("**esercizio#3pt3**\n");
        //
        System.out.println("Digita il cateto 1 del triangolo: ");
        double cateto1 = scanner.nextDouble();
        System.out.println("Digita il cateto 2 del triangolo: ");
        double cateto2 = scanner.nextDouble();
        System.out.println("Digita il cateto 3 del triangolo: ");
        double cateto3 = scanner.nextDouble();
        System.out.println("L'area del triangolo in questione è: " + areaTriangolo(cateto1,cateto2,cateto3));

    }

    public static float perimetroRettangolo(float base, float altezza) {
        return (base + altezza) * 2;
    }

    public static byte pariDispari(int num) {
        if(num%2==0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double c1,double c2,double c3) {
        double p = (c1+c2+c3)/2;
        double area = Math.sqrt(p*(p-c1)*(p-c2)*(p-c3));
        return area;
    }
}
