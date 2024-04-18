package it.epicode.esercizio2;

public class DipendetePartTime extends Dipendente{
    private int oreLavorate;

    public DipendetePartTime(String matricola, double stipendio, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio() * oreLavorate;
    }
}

