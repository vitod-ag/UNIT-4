package it.epicode.esercizio3;

public class Main {
    public static void main(String[] args) {
        DipendenteI[] array = new DipendenteI[4];
        array[0] = new DipendenteFullTime(1459, Dipartimento.AMMINISTRAZIONE);
        array[1] = new DipendentePartTime(1479, Dipartimento.PRODUZIONE);
        array[2] = new Dirigente(1423,  Dipartimento.VENDITE);
        array[3] = new Volontario("Aldo Bianchi",35, "Esperienze in varie associazioni");



        for(int i=0; i<array.length; i++) {
            array[i].checkIn();
        }
    }
}
