import java.util.Scanner;

public class UsaPersona {
    public static void main(String[] args) {


        Persona persona = new Persona("Biagio","Maestri",25, TipoLavoro.STUDENTE);

        System.out.println("\n");

        System.out.println(persona.getNome());
        System.out.println(persona.getCognome());
        System.out.println(persona.getEta());
        System.out.println(Persona.count);  // avendo messo static a count ora fa riferimento alla classe, ma anche se
                                            // scrivessimo l'oggetto si può fare

        System.out.println("\n");

        Persona persona2 = new Persona("Mauro","Belli");
        System.out.println(persona2.getNome());
        System.out.println(persona2.getCognome());
        System.out.println(Persona.count);
        System.out.println();
        System.out.println("Cambio il nome della persona2:");
        persona2.setNome("Luigi");
        System.out.println(persona2.getNome());
        System.out.println();

        Persona persona3 = new Persona("Gianni", "Dadegi");
        System.out.println(persona3.getNome());
        System.out.println(persona3.getCognome());
        System.out.println(persona3.count);
        System.out.println();



        System.out.println("Prima del null a persona:");  //null permette di "marcare" una variabile come non puntante a nessun oggetto, mentre il Garbage Collector si occupa di individuare e liberare la memoria occupata dagli oggetti non più utilizzati nel programma.
        System.out.println(persona);
        System.out.println("\n");
        //persona=null;
        System.out.println(persona);
        //persona=persona2;
        System.out.println(persona2 + "\n");


        System.out.println("Compariamo: (vale solo per gli indirizzi di memoria)");
        System.out.println(persona==persona2);
        System.out.println();
        System.out.println("Con l'equals: " + persona.equals(persona2));
    }
}
