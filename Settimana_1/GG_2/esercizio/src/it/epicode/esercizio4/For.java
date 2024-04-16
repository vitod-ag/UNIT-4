package it.epicode.esercizio4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un intero: ");
        int num = scanner.nextInt();
        System.out.println("Ecco a te il count-down: ");
        contoAllaRovescia(num);
    }

    public static void contoAllaRovescia(int num){
        for (int i=num; i>=0; i--) {
            System.out.println(i);
        }
    }
}
