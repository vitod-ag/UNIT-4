package it.epicode.esercizio2;

public class Chiamata {
    private int numeroChiamato;
    private int minutiConversazione;

    // Costruttore per inizializzare una chiamata con numero chiamato e minuti di conversazione
    public Chiamata(int numeroChiamato, int minutiConversazione) {
        this.numeroChiamato = numeroChiamato;
        this.minutiConversazione = minutiConversazione;
    }

    // Metodo getter per ottenere il numero chiamato
    public int getNumeroChiamato() {
        return numeroChiamato;
    }

    // Metodo setter per impostare il numero chiamato
    public void setNumeroChiamato(int numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    // Metodo getter per ottenere i minuti di conversazione
    public int getMinutiConversazione() {
        return minutiConversazione;
    }

    // Metodo setter per impostare i minuti di conversazione
    public void setMinutiConversazione(int minutiConversazione) {
        this.minutiConversazione = minutiConversazione;
    }
}