package it.epicode.esercizio3;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime("IT011",2200, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new DipendentePartTime("IT007",1800, Dipartimento.PRODUZIONE, 20);
        Dipendente dipendente3 = new Dirigente("IT004", 1700, Dipartimento.VENDITE);
        Volontario volontario5 = new Volontario("Aldo Bianchi",35, "Esperienze in varie associazioni");

        DipendenteI[] lavoratori = { dipendente1,dipendente2,dipendente3,volontario5 };

        for(DipendenteI lavoratore: lavoratori) {
            lavoratore.checkIn();
        }
    }
}
