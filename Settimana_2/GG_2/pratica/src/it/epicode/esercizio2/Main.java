package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita il numero di elementi per la lista: ");
        int n = scanner.nextInt();

        ArrayList<Integer> listaOriginale = CreaListaOrdinata.creaListaOrdinata(n);
        ArrayList<Integer> listaModificata = CreaListaModificata.creaListaModificata(listaOriginale);

        System.out.println("Lista originale generata: " + listaOriginale);
        System.out.println("Lista modificata generata: " + listaModificata);

        System.out.println("Vuoi stampare gli elementi pari (true) o dispari (false)?");
        boolean stampaPari = scanner.nextBoolean();

        PariDispari.stampaElementi(stampaPari, listaModificata);
    }
}
