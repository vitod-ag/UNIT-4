package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Collections;

public class CreaListaModificata {

    public static ArrayList<Integer> creaListaModificata(ArrayList<Integer> lista) {


        ArrayList<Integer> listaModificata = new ArrayList<>();

        listaModificata.addAll(lista);

        Collections.reverse(lista);

        listaModificata.addAll(lista);

        return listaModificata;
    }
}
