package it.epicode;

public abstract class ElementoMultimediale {
    private String title;
    private int duration;
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ElementoMultimediale(String title) {
        this.title=title;
    }

    public ElementoMultimediale(String title, int duration, int volume) {
        this.title = title;
        this.duration = duration;
        this.volume= volume;
    }


    public void play() {

    }
    public void show() {

    }


}
