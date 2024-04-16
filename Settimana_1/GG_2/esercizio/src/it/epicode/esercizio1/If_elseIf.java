package it.epicode.esercizio1;

import java.util.Scanner;

public class If_elseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.nextLine();
        boolean verify = stringaPariDispari(stringa);
        if (verify) {
            System.out.println("Stringa di lunghezza pari");
        }else {
            System.out.println("Stringa di lunghezza dispari");
        }


        System.out.println("Digita l'anno e vediamo se è bisestile:");
        int anno = scanner.nextInt();
        boolean annoBisestile = annoBisestile(anno);
        if (annoBisestile) {
            System.out.println("Anno bisestile");
        }else {
            System.out.println("Anno non bisestile");
        }

    }

    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length()%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0 || ((anno % 4 == 0) && (anno % 100 != 0))) {
            return true;
        }
        return false;
    }
}
