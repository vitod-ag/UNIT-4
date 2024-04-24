package Lambda;

import java.util.Comparator;
import java.util.TreeSet;
// funzione lambda 2
public class ProvaLambda2 {
    public static void main(String[] args) {
        // usiamo la classe anonima visto che il comparatore sarà usato solo una volta e basta
        TreeSet<String> parole = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        parole.add("java");
        parole.add("html");
        parole.add("css");
        parole.add("javascript");
        System.out.println(parole);
    }
}
