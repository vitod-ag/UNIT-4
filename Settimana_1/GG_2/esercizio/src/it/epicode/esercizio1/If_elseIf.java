package it.epicode.esercizio1;

import java.util.Scanner;

public class If_elseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.nextLine();
        boolean verify = stringaPariDispari(stringa);
        System.out.println("La stringa " + stringa + " è pari(true) oppure no(false)? " + verify);

        System.out.println("Digita l'anno e vediamo se è bisestile:");
        int anno = scanner.nextInt();
        boolean annoBisestile = annoBisestile(anno);
        System.out.println("L'anno " + anno + " è bisestile? " + annoBisestile);

    }

    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length()%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if(anno%4==0){
            return true;
        }else if(anno%100==0) {
            if(anno%400 == 0) {
                return true;
            }
        }
        return false;
    }
}
