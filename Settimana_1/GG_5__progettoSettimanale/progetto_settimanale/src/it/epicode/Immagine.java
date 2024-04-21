package it.epicode;

public class Immagine implements ElementoMultimediale{
    private String title;
    private int luminosita;

    public Immagine(String title, int luminosita) {
        this.title = title;
        this.luminosita = luminosita;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void esegui() {
        System.out.println(title + " " + "*".repeat(luminosita));
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}
