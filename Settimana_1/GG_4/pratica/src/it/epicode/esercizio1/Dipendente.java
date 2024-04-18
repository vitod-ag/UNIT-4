package it.epicode.esercizio1;

//rendo questa classe abstract ovvero che non può essere istanziata direttamente,
// ma serve come modello per le sue sottoclassi.
public class Dipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente (String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola= matricola;
        this.stipendio=stipendio;
        this.dipartimento=dipartimento;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento=dipartimento;
    }

}
