package it.epicode.esercizio3;

import java.util.Date;

public class UsaCarrello {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("55f56","Pensieri lenti, pensieri veloci", 10, 5);
        Articolo articolo2 = new Articolo("7fdg9","Resto qui", 35, 1);

        Cliente cliente = new Cliente("itRossi","Mario Rossi","mario@rossi.com", new Date());

        Carrello carrello = new Carrello(cliente);

        if(carrello.aggiungiArticolo(articolo1)){
            System.out.println("Articolo aggiunto!");
        }else {
            System.out.println("Errore! Articolo non aggiunto");
        }
        if(carrello.aggiungiArticolo(articolo2)){
            System.out.println("Articolo aggiunto!");
        }else {
            System.out.println("Errore! Articolo non aggiunto");
        }
        if(carrello.aggiungiArticolo(articolo1)){
            System.out.println("Articolo aggiunto!");
        }else {
            System.out.println("Errore! Articolo non aggiunto");
        }
        if(carrello.aggiungiArticolo(articolo2)){
            System.out.println("Articolo aggiunto!");
        }else {
            System.out.println("Errore! Articolo non aggiunto");
        }
        carrello.controllaCarrello();
    }
}
