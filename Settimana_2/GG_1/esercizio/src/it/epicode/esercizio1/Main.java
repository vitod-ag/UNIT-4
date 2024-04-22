package it.epicode.esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeri = new int[5];
        // ciclo per generare i numeri random
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = new Random().nextInt(1, 11); //metto 11 perché cosi faccio da 1 a 10
        }
        // ciclo per stampare
        for (int numero : numeri) {
            System.out.println(numero);
        }

        inserisciNumeroArray(numeri);
        for (int numero : numeri) {
            System.out.println(numero);
        }
    }

    public static void inserisciNumeroArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int numero=0;
        do {
            System.out.println("Inserisci un numero: ");
            numero = scanner.nextInt();

            System.out.println("Inserisci la posizione dove inserire questo numero nell'array: ");
            int pos = scanner.nextInt();
            try{
                if (numero != 0) {
                    array[pos] = numero;
                }
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore! L'indice dell'array deve essere compreso tra 1 e 5");
            }
        } while (numero!=0);
    }
}
