package Object;

public class UsaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mario", "Rossi", 34);
        Persona p2 = new Persona("Mario", "Rossi", 34);
        System.out.println("\n--Teoria Persona--");
        // senza il toString Java ci va a prendere l'indirizzo di memoria
        System.out.println("Valore con il toString: " + p2.toString() + " e " + p1);
        // avendo fatto già il toString nella classe nel main è ridondante farlo

        System.out.println("\n Confrontiamo: ");
        System.out.println("Il confronto qui lo faccio con equals : " + p1.equals(p2));  //ora ci esce true con equals avendo nome,cognome ed eta uguali
        System.out.println("Il confronto qui lo faccio con == : " + (p1==p2));

        //proviamo gli hashcode fatto Override in Persona
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


    }
}
