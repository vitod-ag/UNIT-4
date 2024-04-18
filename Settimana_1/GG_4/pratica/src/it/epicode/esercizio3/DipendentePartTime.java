package it.epicode.esercizio3;

public class DipendentePartTime extends Dipendente{
    private int oreLavorate;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }


    @Override
    public double calcolaStipendio() {
        return this.getStipendio() * this.oreLavorate;
    }
}
