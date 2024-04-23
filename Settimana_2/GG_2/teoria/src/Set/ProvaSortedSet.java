package Set;

import java.util.Comparator;
import java.util.TreeSet;
import Object.Persona;
public class ProvaSortedSet {
    public static void main(String[] args) {
        TreeSet<Persona> persone = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });   // questa è una classe anonima

        Persona p1 = new Persona("Roberto", "Bianchi", 26);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        Persona p3 = new Persona("Carlo", "Verdi", 41);
        Persona p4 = new Persona("Mario", "Rossi", 34);
        Persona p5 = new Persona("Mario", "Rossi", 34);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);
        persone.add(p5);


        System.out.println("\n" + persone);
        // il treeSet deve avere anche un modo per ordinare: una classe anonima
        // le classi anonime sono classi che non hanno nome e discendono da un'interfaccia

    }
}
