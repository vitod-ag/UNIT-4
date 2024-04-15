package it.epicode;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        System.out.println("**esercizio pt1**");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();
        int risultato =moltiplica(num1,num2);
        System.out.println("Risultato: " + risultato);
        System.out.println("**esercizio pt2**");
        scanner.nextLine();  // lo uso per svuotare il buffer
        System.out.println("Scrivi una parola: ");
        String string = scanner.nextLine();
        System.out.println("Scrivi un'intero: ");
        int num3 = scanner.nextInt();
        String resultConcat = concatena(string, num3);
        System.out.println("Risultato: " + resultConcat);
        System.out.println("**esercizio pt3**");
        String[] nuovoArray = inserisciInArray(new String[]{"mamma","papà","zio","amica","pippo"}, "mario");
        System.out.println(Arrays.toString(nuovoArray));


    }
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String stringa, int num) {
        return stringa+num;
    }

    public static String[] inserisciInArray(String[] array, String string) {
        return new String[] {array[0], array[1], string,  array[2], array[3], array[4]};
    }
}
