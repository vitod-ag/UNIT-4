package it.epicode.esercizio3;

public class Dirigente extends Dipendente{
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio();
    }
}
