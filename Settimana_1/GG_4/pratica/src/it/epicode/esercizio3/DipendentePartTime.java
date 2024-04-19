package it.epicode.esercizio3;

public class DipendentePartTime extends Dipendente{

    public DipendentePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(giorni*60);
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio attività ore 14");
    }
}
