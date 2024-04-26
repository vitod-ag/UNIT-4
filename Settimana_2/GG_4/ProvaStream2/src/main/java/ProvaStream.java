import java.util.*;
import java.util.stream.Collectors;

public class ProvaStream {
    public static void main(String[] args) {
        Prodotto libro1 = new Prodotto(100L, "Il signore degli anelli", "Libri", 101);
        Prodotto libro2 = new Prodotto(101L, "Il giorno nero", "Libri", 102);
        Prodotto libro3 = new Prodotto(102L, "Collision", "Libri", 10);
        Prodotto libro4 = new Prodotto(103L, "Marracash", "Libri", 13);
        Prodotto baby1 = new Prodotto(104L, "pannolini", "Baby", 7);
        Prodotto baby2 = new Prodotto(105L, "tutina", "Baby", 15);
        Prodotto baby3 = new Prodotto(106L, "cappello", "Baby", 10);
        Prodotto boys1 = new Prodotto(107L, "scarpe", "Boys", 70);
        Prodotto boys2 = new Prodotto(108L, "felpa", "Boys", 40);
        Prodotto boys3 = new Prodotto(109L, "pantalone", "Boys", 40);
        List<Prodotto> prodotti = List.of(libro1, libro2, libro3, libro4, boys1, boys2, boys3, baby1, baby2, baby3);

        //creo un set di prezzi dei prodotti(elimino i duplicati dei prezzi rispetto all'esempio precedente)
        System.out.println("Stream con il Set/toSet");
        Set<Double> s1 = prodotti.stream().map(prodotto -> prodotto.getPrezzo()).collect(Collectors.toSet());
        s1.forEach(n -> System.out.println(n));

        System.out.println();

        //creo una lista con i prezzi dei prodotti
        System.out.println("Stream con il List/toList");
        List<Double> l1 = prodotti.stream().map(prodotto -> prodotto.getPrezzo()).collect(Collectors.toList());
        l1.forEach(n -> System.out.println(n));

        System.out.println();

        // creo un map: il metodo toMap ha due parametri, e quindi anche il forEach del map ha due parametri
        System.out.println("Stream con il Map/toMap");
        Map<Long, Double> m1 = prodotti.stream()
                .collect(Collectors.toMap(prodotto -> prodotto.getId(), prodotto -> prodotto.getPrezzo()));
        m1.forEach((id, valore) -> System.out.println(id + " " + valore));

        System.out.println();

        //metodo reference (mette i due punti)
        //Map<Long,Double> m1 = prodotti.stream()
        //    .collect(Collectors.toMap(Prodotto::getId, Prodotto::getPrezzo));


        // groupingby restituisce sempre una Map. Le Map NON hanno duplicati
        System.out.println("--> Stream con il Map + groupBy");
        Map<String, List<Prodotto>> m2 = prodotti.stream().collect(Collectors.groupingBy(Prodotto::getCategoria));
        m2.forEach((id, valore) -> System.out.println(id + " " + valore));

        System.out.println("\n*PARTE_2* --> Stream con il Map + groupBy");
        Map<String, Long> m3 = prodotti.stream().collect(Collectors.groupingBy(Prodotto::getCategoria, Collectors.counting()));
        m3.forEach((id, valore) -> System.out.println(id + " " + valore));


        System.out.println("\n*PARTE_3* --> Stream con il Map + groupBy");
        Map<String, Double> m4 = prodotti.stream().collect(Collectors.groupingBy
                (Prodotto::getCategoria, Collectors.averagingDouble(Prodotto::getPrezzo)));
        m4.forEach((id, valore) -> System.out.println(id + " " + valore));

        System.out.println("\n*PARTE_4* --> Stream con il Map + groupBy(addizione)");
        Map<String, Double> m5 = prodotti.stream().collect(Collectors.groupingBy
                (Prodotto::getCategoria, Collectors.summingDouble(Prodotto::getPrezzo)));
        m5.forEach((id, valore) -> System.out.println(id + " " + valore));


        // in questo caso calcolo la somma di tutti i prezzi dei prodotti
        System.out.println("\n*PARTE_5* --> Stream con il solo double con l'addizione");
        double somma = prodotti.stream().map(Prodotto::getPrezzo).collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println(somma);

        // calcoliamo la media
        System.out.println("\n*PARTE_6* --> Stream con il solo double con la media");
        double media = prodotti.stream().map(Prodotto::getPrezzo).collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println(media);

        // metodo di sintesi: summarizingDouble= produce una variabile DoubleSummaryStatistics
        System.out.println("\n*PARTE_7* --> Stream con il solo double con l'addizione");
        DoubleSummaryStatistics sommaStatistica  = prodotti.stream().map(Prodotto::getPrezzo).
                collect(Collectors.summarizingDouble(Double::doubleValue));
        // solo stampandola mi dà tutte le statistiche --> System.out.println(SommaStatistica);
        System.out.println(sommaStatistica.getMin());

        //il tutto viene messo in una Map
        System.out.println("\n*PARTE_8* --> Stream con il solo double con partition");
        Map<Boolean, List<Prodotto>> m6 = prodotti.stream().collect(Collectors.partitioningBy(p->p.getPrezzo()<50));
        m6.forEach((id,valore) -> System.out.println(id + " " + valore));

        System.out.println("\n*PARTE_9* --> Stream con il solo double con l'addizione");
        double somma2 = prodotti.stream().map(Prodotto::getPrezzo)
                .reduce(0.0, (s, elemento) -> (s + elemento.doubleValue()));
        System.out.println(somma2);
        // si potrebbe fare anche con il solo reduce --> prodotti.stream().map(Prodotto::getPrezzo)
        //                .collect(Collectors.reducing(0.0,(s,elemento)->(s+elemento.doubleValue())));

        System.out.println("\n-----------COMPARATORS----------------");
        System.out.println("\n*COMPARATORS PT_1* --> ordino lo stream di prodotti secondo l'ordine decrescente del prezzo");
        // ordino lo stream di prodotti secondo l'ordine decrescente del prezzo
        prodotti.stream().
                sorted(Comparator.comparingDouble(Prodotto::getPrezzo).
                        reversed()).forEach(System.out::println);

        System.out.println("\n*COMPARATORS PT_2* --> calcolo con i metodi map = poco codice!");
        double somma3 = prodotti.stream().mapToDouble(Prodotto::getPrezzo).sum();
        System.out.println(somma3);
        System.out.println("\n*COMPARATORS PT_3 --> uso OptionalDouble e non solo double*");
        OptionalDouble max2  = prodotti.stream().mapToDouble(Prodotto::getPrezzo).max();
        System.out.println(max2.getAsDouble());


    }
}