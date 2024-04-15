package it.epicode;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la stringa numero uno: ");
        String string1 = scanner.nextLine();
        System.out.println("Inserisci la stringa numero due: ");
        String string2 = scanner.nextLine();
        System.out.println("Inserisci la stringa numero tre: ");
        String string3 = scanner.nextLine();
        String ordain = concatenaStringhe(string1,string2,string3);
        System.out.println("Le stringhe ordinate in ordine di inserimento: " + ordain);
        // stampo le stringhe in reverse
        System.out.println("Le stringe al reverse:");
        StringBuilder stringReverse = new StringBuilder(ordain).reverse();
        System.out.println(stringReverse);
    }
    public static String concatenaStringhe(String firstString, String secondString, String thirdString) {
        return firstString + secondString + thirdString;
    }
}
