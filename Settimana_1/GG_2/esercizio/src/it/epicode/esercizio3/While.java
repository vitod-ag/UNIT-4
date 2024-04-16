package it.epicode.esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita una stringa:");
        String string = scanner.nextLine();

        System.out.println("La stringa in questione è " + stringaPariDispari(string));
    }

    public static boolean stringaPariDispari(String s) {
        if (s.length()%2==0){
            return true;
        }
        return false;
    }
}



