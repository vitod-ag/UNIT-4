package it.epicode.esercizio1;

public class UsaDipendente {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("IT001",2200, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente("IT002",1800, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente("IT003", 1700, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1,dipendente2,dipendente3};

        for(Dipendente dipendente: dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }
}
