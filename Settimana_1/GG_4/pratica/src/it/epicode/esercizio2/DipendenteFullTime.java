package it.epicode.esercizio2;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(1700);
    }
}



