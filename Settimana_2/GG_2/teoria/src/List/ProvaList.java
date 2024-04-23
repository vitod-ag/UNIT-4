package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProvaList {
    public static void main(String[] args) {
        System.out.println("\n ----TEORIA----");
        ArrayList<String> lista = new ArrayList<>();  // ci conviene mettere tra le angolari il tipo
        lista.add("5");
        lista.add("mamma");
        lista.add("true");

        System.out.println("Lista dopo avere fatto get dell'elemento in pos 0: " + lista.get(0));

        lista.set(2,"pippo");

        System.out.println("Lista dopo avere fatto set: " + lista);
        System.out.println("Lista dopo avere fatto size: " + lista.size());

        //lista.clear();

        lista.remove(0);
        System.out.println("Lista dopo avere fatto remove in pos 0: " + lista.size());
        lista.remove("pippo");  // remove rimuove solo il primo che incontra
        System.out.println("Lista dopo avere fatto remove scrivendo un elemento della list: " + lista.size());

        System.out.println("Metodo per capire se una lista è vuota o no: " + lista.isEmpty());
        System.out.println("Metodo per capire se un elemento è presente o no: " + lista.contains("pluto"));

        // CLASSI WRAPPER: (nelle angolari non si possono usare i tipi primitivi, ma solo classi)
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean

        // Auto-boxing dei wrapper
        Integer iObject = 4;

        // Auto-unboxing (possibilità che Java ci offre)
        int i = iObject;  // con intValue ci estrae il valore dell'intero e lo fa per noi
        System.out.println("Valore della variabile int i dopo avergli assegnato l'oggetto wrapper Integer: " + i);

        int j = Integer.parseInt("123"); // il parse è un metodo statico che converte il tipo in cosa mettiamo nella tonda
        System.out.println("Valore dopo il parseInt: " + j);

        System.out.println("Il valore massimo che Integer può avere: " + Integer.MAX_VALUE);


        lista.add("mario");
        lista.add("giovanni");
        lista.add("leonardo");
        System.out.println("Il primo indice dell'oggetto nelle tonde: " + lista.indexOf("giovanni"));

        System.out.println("\nLista: ");
        System.out.println(lista);
        //metodo statico per creare una lista senza creare un oggetto e rapidamente
        lista.removeAll(List.of("mario", "leonardo"));
        System.out.println("Lista dopo il removeAll tramite il list.of: " + lista);

        // uso del for-each
        System.out.println();
        for(String s:lista){
            System.out.println(s);
        }

        // LinkedList è come ArrayList ma ha anche le caratteristiche della queue(FIFO) con altri metodi
        LinkedList<String> lista2 = new LinkedList<>();

        lista2.poll(); // metodo dove possiamo prendere l'elemento primo della lista,
                       // ci facciamo dare una copia e lo cancella = come una coda

        // ArrayList = utile per la ricerca avendo posizioni/indici
        // LinkedList = + veloce nel aggiungere/rimuovere elementi



    }
}
