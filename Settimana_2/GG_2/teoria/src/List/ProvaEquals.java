package List;

import Object.Persona;
import java.util.ArrayList;

public class ProvaEquals {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();

        Persona p1 = new Persona("Roberto", "Bianchi", 26);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        Persona p3 = new Persona("Carlo", "Verdi", 41);
        Persona p4 = new Persona("Mario", "Rossi", 34);
        Persona p5 = new Persona("Mario", "Rossi", 34);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);

        System.out.println();
        System.out.println("Se non ci sta equals, confronta solo gli indirizzi di memoria e quindi prima dava false, mentre ora: " + persone.contains(p5));
        // qui lui fa equals con tutti gli elementi dell'array persone e quindi da false perche stanno comentati
        // gli Override di equals di Persona
        System.out.println("Ora lo faccio con equals nella classe Persona: " + persone.contains(p5));
    }
}
