package it.epicode.esercizio2;

import java.util.ArrayList;

public class PariDispari {
    public static void stampaElementi(boolean b, ArrayList<Integer> lista) {
        if (b) {
            for (int i = 0; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }
        }else {
            for (int i = 1; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
