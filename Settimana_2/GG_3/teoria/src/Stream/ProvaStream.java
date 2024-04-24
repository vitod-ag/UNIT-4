package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProvaStream {

    public static void main(String[] args) {
        List<String> lista = List.of("java", "javascript", "html", "css", "python", "html");
        //stampo con il foreach il contenuto dello stream che è filtrato rispetto alla lista
        //il filtro accetta solo le parole lunghe meno di 5
        //lista.stream().filter(s -> s.length()<5).forEach(s -> System.out.println(s));

        //stampo il contenuto dello stream limitando le parole alle prime 3 del flusso
        //lista.stream().limit(3).forEach(s -> System.out.println(s));

        //stampo il contenuto dello stream sostituendo ad ogni parola la sua lunghezza
        //lista.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

        //stampo il contenuto dello stream eliminando i duplicati
        //lista.stream().distinct().forEach(s -> System.out.println(s));

        //stampo il contenuto dello stream ordinando le parole in ordine decrescente
        //lista.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(s -> System.out.println(s));

        //genero la somma delle lunghezze delle stringhe presenti nello stream
//        int totale=lista.stream().map(s -> s.length()).reduce(0,(somma,l)->somma+l);
//
//        System.out.println(totale);

        //genero il totale delle lunghezze delle stringhe che hanno lunghezza <5
//        int totale=lista.stream().map(s -> s.length()).filter(l->l<5).reduce(0,(somma,l)->somma+l);
//        System.out.println(totale);

        //concateno tutte le stringhe dello stream con separatore ", " ordinando e eliminando i duplicati
//        String finale =lista.stream().sorted().distinct().collect(Collectors.joining(", "));
//        System.out.println(finale);

        //creo un set di lunghezze delle stringhe (il set in automatico elimina i duplicati)
//        Set<Integer> numeri = lista.stream().map(s -> s.length()).collect(Collectors.toSet());
//        System.out.println(numeri);

        //Lista di liste. Come unire i contenuti delle liste interne attraverso flatmap
        List<String> lista2 = List.of("epicode", "accenture", "byte");

        List<List<String>> lista3 = List.of(lista, lista2);

        List<String> listaFinale = lista3.stream().flatMap(list-> list.stream()).collect(Collectors.toList());

        System.out.println(listaFinale);
    }
}