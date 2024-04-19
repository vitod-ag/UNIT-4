package it.epicode.esercizio3;

public class Dirigente extends Dipendente{

    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(2200);
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio attività ore 10:30");
    }
}
