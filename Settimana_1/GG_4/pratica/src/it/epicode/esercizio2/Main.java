package it.epicode.esercizio2;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime("IT011",2200, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new DipendetePartTime("IT007",1800, Dipartimento.PRODUZIONE, 20);
        Dipendente dipendente3 = new Dirigente("IT004", 1700, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1,dipendente2,dipendente3};

        for(Dipendente dipendente: dipendenti) {
            System.out.println("Dipendente: " + dipendente.calcolaStipendio() + "€");
        }
    }
}
