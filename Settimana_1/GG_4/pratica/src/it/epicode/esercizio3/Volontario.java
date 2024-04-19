package it.epicode.esercizio3;

public class Volontario implements DipendenteI {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCV() {
        return this.CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio attivita ore 12");
    }
}
