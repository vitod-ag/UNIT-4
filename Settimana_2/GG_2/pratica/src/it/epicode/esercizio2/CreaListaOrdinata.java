package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CreaListaOrdinata {
    public static ArrayList<Integer> creaListaOrdinata(int numero) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < numero; i++) {
            lista.add(new Random().nextInt(0,101));
        }
        Collections.sort(lista);  // ordinamento di default: quallo crescente
        return lista;
    }
}
