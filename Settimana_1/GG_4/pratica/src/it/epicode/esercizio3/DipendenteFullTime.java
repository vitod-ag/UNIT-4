package it.epicode.esercizio3;

public class DipendenteFullTime extends Dipendente{
    public DipendenteFullTime (int matricola, Dipartimento dipartimento) {
        super(matricola,dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(1700);
    }

    @Override
    public void checkIn() {
         System.out.println("Inizio attività ore 9");
    }

}
