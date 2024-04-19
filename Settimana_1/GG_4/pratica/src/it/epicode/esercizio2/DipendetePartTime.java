package it.epicode.esercizio2;

public class DipendetePartTime extends Dipendente{

    public DipendetePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(giorni*60);
    }
}

