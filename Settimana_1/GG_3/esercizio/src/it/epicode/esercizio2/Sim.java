package it.epicode.esercizio2;


public class Sim {
    private int numero;
    private double credito;
    private Chiamata[] chiamate;

    // Costruttore per creare una SIM con il numero di telefono
    public Sim(int numero) {
        this.numero = numero;
    }

    // Metodo getter per ottenere il numero di telefono
    public int getNumero() {
        return numero;
    }

    // Metodo setter per impostare il numero di telefono
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Metodo getter per ottenere il credito disponibile
    public double getCredito() {
        return credito;
    }

    // Metodo setter per impostare il credito disponibile
    public void setCredito(double credito) {
        this.credito = credito;
    }

    // Metodo getter per ottenere l'elenco delle chiamate
    public Chiamata[] getChiamate() {
        return chiamate;
    }

    // Metodo setter per impostare l'elenco delle chiamate
    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numero);
        System.out.println("Credito disponibile: " + credito);

        // Stampa le informazioni su ogni chiamata effettuata
        for (int i = 0; i < chiamate.length; i++) {
            System.out.println("Numero chiamato: " + chiamate[i].getNumeroChiamato() +
                    ", Minuti di conversazione: " + chiamate[i].getMinutiConversazione());
        }
    }
}
