package it.epicode.esercizio2;

//rendo questa classe abstract ovvero che non può essere istanziata direttamente,
// ma serve come modello per le sue sottoclassi.
public abstract class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente (int matricola, Dipartimento dipartimento) {
        this.matricola= matricola;
        this.dipartimento=dipartimento;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento=dipartimento;
    }

    // setto lo stipendio poiché i dipendenti non hanno lo stesso stipendio
    public void setStipendio(double stipendio){
        this.stipendio=stipendio;
    }

    // Metodo astratto per calcolare lo stipendio aggiungendoci la variabile giorni in base se è Full o Part Time
    public abstract void calcolaStipendio(int giorni);

}
