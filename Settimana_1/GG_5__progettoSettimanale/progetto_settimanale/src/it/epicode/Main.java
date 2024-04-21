package it.epicode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Digita il titolo dell'elemento multimediale: ");
            String title = scanner.nextLine();

            System.out.println("Se l'elemento è un'immagine, inserisci la luminosità:");
            int luminosita = Integer.parseInt(scanner.nextLine());

            System.out.println("Se l'elemento è un video o un'audio, inserisci la durata:");
            int durata = Integer.parseInt(scanner.nextLine());

            System.out.println("Se l'elemento è un video o un'audio, inserisci il volume:");
            int volume = Integer.parseInt(scanner.nextLine());

            System.out.println("Se l'elemento è un video, inserisci la luminosità:");
            int luminositaVideo = Integer.parseInt(scanner.nextLine());

            //creo l'oggetto in base a cosa ha scelto l'utente
            if( durata > 0 ) {
                if ( luminositaVideo > 0){
                    elementi[i] = new Video(title,durata,volume,luminositaVideo);
                }else {
                    elementi[i] = new Audio(title,durata,volume);
                }
            }else {
                elementi[i] = new Immagine( title, luminosita);
            }
        }

        // mostro a video l'elemento scelto
        int scelta = -1;
        do {
            System.out.println("Inserisci il numero corrispondente all'elemento da eseguire");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta >= 1 && scelta<= 5) {
                elementi[scelta-1].esegui();
            }
        }while (scelta != 0);

    }
}
