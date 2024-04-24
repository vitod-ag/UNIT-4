package Lambda;

import java.util.TreeSet;
// funzione lambda 3 (con la sola "funzione freccia")
public class ProvaLambda3 {

    public static void main(String[] args) {

        TreeSet<String> parole = new TreeSet<>( (o1, o2) -> (o2.compareTo(o1)) );
        parole.add("java");
        parole.add("html");
        parole.add("css");
        parole.add("javascript");

        //parole.forEach(p->System.out.println(p));  // non restituisce nulla, fa solo l'operazione oppure stampa

        parole.removeIf(s -> s.contains("l"));   // rimuove tutta la parola che contiene j in questo caso
        parole.forEach(s -> {
            s=s+"!";
            System.out.println(s);
        } );
    }
}
