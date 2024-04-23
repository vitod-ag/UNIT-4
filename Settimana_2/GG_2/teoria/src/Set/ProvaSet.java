package Set;

import java.util.HashSet;
import Object.Persona;

public class ProvaSet {
    public static void main(String[] args) {
        HashSet<Persona> persone = new HashSet<>();

        Persona p1 = new Persona("Roberto", "Bianchi", 26);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        Persona p3 = new Persona("Carlo", "Verdi", 41);
        Persona p4 = new Persona("Mario", "Rossi", 34);
        Persona p5 = new Persona("Mario", "Rossi", 34);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        System.out.println(persone.add(p4)); // mi torna false perché è un duplicato

        System.out.println();
        System.out.println("************** \n" + persone);
        //senza hashcode permetterebbe di inserire anche p5 che è uguale a p4
        persone.add(p5);
        System.out.println();
        System.out.println("Con l'hashset: \n" + persone);

        System.out.println("\nFaccio il for-each: ");
        for (Persona p: persone) {
            System.out.println(p);
        }
    }
}
