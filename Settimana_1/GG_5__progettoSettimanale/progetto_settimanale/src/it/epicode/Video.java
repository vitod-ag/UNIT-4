package it.epicode;

public class Video implements ElementoMultimediale{
    private String title;
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String title, int volume, int durata, int luminosita) {
        this.title = title;
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public int getDurata() {
        return this.durata;
    }

    @Override
    public void esegui() {
        for (int i = 0; i < durata; i++) {
            System.out.println(title + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
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
