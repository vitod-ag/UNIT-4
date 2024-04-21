package it.epicode;

public class Audio implements ElementoMultimediale{
    private String title;
    private int durata;
    private int volume;

    public Audio (String title, int durata, int volume) {
        this.title=title;
        this.durata=durata;
        this.volume=volume;
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
        for(int i=0; i<durata; i++) {
            System.out.println(title + " " + "!".repeat(volume));
        }
    }

    public void abbassaVolume() {
        if(volume > 0 ) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

}
