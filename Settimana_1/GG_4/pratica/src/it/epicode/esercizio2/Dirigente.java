package it.epicode.esercizio2;

public class Dirigente extends Dipendente {

    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(3000);
    }
}
