package Map;
import Object.Persona;

public class UsaAnagrafe {
    public static void main(String[] args) {
        Anagrafe anagrafe = new Anagrafe();
        Persona p1 = new Persona("Roberto", "Bianchi", 26);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        Persona p3 = new Persona("Carlo", "Verdi", 41);

        anagrafe.aggiungiPersona("SGD364784JCDSNSJ",p1);
        anagrafe.aggiungiPersona("FFVG58632VGFDBVB",p2);
        anagrafe.aggiungiPersona("DFV6546FGBFGB555",p3);

        System.out.println();
        anagrafe.stampaAnagrafe();

    }
}
