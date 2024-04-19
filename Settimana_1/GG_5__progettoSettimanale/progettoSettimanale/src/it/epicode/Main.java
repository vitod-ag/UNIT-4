package it.epicode;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("Track1", 100,10 );
        audio1.play();
        Video video1 = new Video("Video2", 50,9,6);
        video1.play();
        Immagine immagine1= new Immagine("Gioconda",8);
        immagine1.show();
    }
}
