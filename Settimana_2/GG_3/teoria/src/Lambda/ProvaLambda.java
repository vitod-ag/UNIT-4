package Lambda;
// funzione lambda 1
import java.util.TreeSet;

public class ProvaLambda {
    public static void main(String[] args) {
        Comparatore comparatore = new Comparatore();  // creo il comparatore 1 sola volta e lo utilizzo nel costruttore del TreeSet
        TreeSet<String> parole = new TreeSet<>(comparatore);   //devo passare un Comparator x farli uscire in questo caso decrescente
        parole.add("java");
        parole.add("html");
        parole.add("css");
        parole.add("javascript");
        System.out.println(parole); //cosi l'ordinamento è alfabetico crescente
    }
}
