package it.epicode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        for (int i = 0; i < elementi.length; i++) {
            int risultato;
            do {
                System.out.println("Quale elemento vuoi creare?\nDigita:\n1-Immagine\n2-Video\n3-Audio");
                risultato = scanner.nextInt();
                if (risultato < 1 || risultato > 3){
                    System.out.println("Inserisci un valore che comprende gli interi richiesti");
                }
            } while (risultato < 1 || risultato > 3);
            scanner.nextLine();  // pulisco il buffer
            System.out.println("Inserisci un titolo per la tua scelta");
            String title = scanner.nextLine();
            int luminosita;
            int volume;
            int durata;
            switch (risultato){
                case 1:
                    do {
                        System.out.println("Quanta luminosita deve avere l'immagine da 0 a 10?");
                        luminosita = scanner.nextInt();
                        if (luminosita < 0 || luminosita > 10) {
                            System.out.println(("Devi inserire un numero positivo compreso tra 0 e 10"));
                        }
                    } while (luminosita < 0 || luminosita > 10 );
                    Immagine immagine = new Immagine(title,luminosita);
                    elementi[i] = immagine;
                    break;
                case 2:
                    do {
                        System.out.println("Quanta luminosita deve avere il video da 0 a 10?");
                        luminosita = scanner.nextInt();
                        if (luminosita < 0 || luminosita > 10) {
                            System.out.println(("Devi inserire un numero positivo compreso tra 0 e 10"));
                        }
                    } while (luminosita < 0 || luminosita > 10 );
                    do {
                        System.out.println("Che durata deve avere il video da 1 a 10?");
                        durata = scanner.nextInt();
                        if (durata < 1) {
                            System.out.println(("Devi inserire un numero positivo e diverso da 0"));
                        }
                    } while (durata < 1 );
                    do {
                        System.out.println("Che volume deve avere il video? Inserire un numero da 0 a 10?");
                        volume = scanner.nextInt();
                        if (volume < 0 || volume > 10 ) {
                            System.out.println(("Devi inserire un numero positivo e che sia compreso tra 0 e 10"));
                        }
                    } while (volume < 0 || volume > 10 );
                    Video video = new Video(title,durata,volume,luminosita);
                    elementi[i] = video;
                    break;
                case 3:
                    do {
                        System.out.println("Che durata deve avere l'audio da 1 a 10?");
                        durata = scanner.nextInt();
                        if (durata < 1) {
                            System.out.println(("Devi inserire un numero positivo e diverso da 0"));
                        }
                    } while (durata < 1 );
                    do {
                        System.out.println("Che volume deve avere l'audio? Inserire un numero da 0 a 10?");
                        volume = scanner.nextInt();
                        if (volume < 0 || volume > 10 ) {
                            System.out.println(("Devi inserire un numero positivo e che sia compreso tra 0 e 10"));
                        }
                    } while (volume < 0 || volume > 10 );
                    Audio audio = new Audio(title,durata,volume);
                    elementi[i] = audio;
                    break;
                default:
                    break;
            }
        }
        int scelta;
        do{
            System.out.println("Scegli un numero tra 1 e 5 ovvero uno degli elementi creati prima");
            scelta = scanner.nextInt();
            if(scelta == 0) {
                System.out.println("Hai scelto 0: programma terminato");
            }else if (scelta > 0 && scelta <= elementi.length){
                System.out.println("Hai scelto l'elemento multimediale " + elementi[scelta-1].getTitle());
                if(elementi[scelta-1] instanceof Immagine) {
                    elementi[scelta-1].show();
                } else {
                    elementi[scelta-1].play();
                }
            }else {
                System.out.println("Devi inserire un numero tra 1 e 5");
            }
        }while(scelta!=0);
    }
}


