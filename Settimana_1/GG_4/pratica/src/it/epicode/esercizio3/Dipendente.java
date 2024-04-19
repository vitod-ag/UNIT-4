package it.epicode.esercizio3;

public abstract class Dipendente implements DipendenteI {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    // setto lo stipendio poiché i dipendenti non hanno lo stesso stipendio
    public void setStipendio(double stipendio){
        this.stipendio=stipendio;
    }


    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract void calcolaStipendio(int giorni);

}
