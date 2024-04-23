package it.epicode.esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            HashSet<String> parole = new HashSet<>();
            ArrayList<String> listaDuplicati = new ArrayList<>();
            System.out.println("Inserisci quante parole vuoi inserire: ");
            int n = scanner.nextInt();
            int i = 0;
            scanner.nextLine(); // pulisco il buffer
            while (i < n) {
                System.out.println("Dammi una parola");
                String parola = scanner.nextLine();

                if (!parole.add(parola)) {
                    listaDuplicati.add(parola);
                }
                i++;
            }
            System.out.println("La lista dei duplicati è: " + listaDuplicati);
            System.out.println();
            System.out.println("Il numero delle parole distinte è: " + parole.size());
            System.out.println();
            System.out.println("Lista delle parole distinte: " + parole);
        } catch (Exception e) {
            System.err.println("Si è verificato un errore durante l'esecuzione del programma.");
            e.printStackTrace();
        }
    }
}
