package it.epicode.esercizio3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int quantita;

    public Articolo(String codice, String descrizione, double prezzo, int quantita) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public int getQuantita() {
        return this.quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
