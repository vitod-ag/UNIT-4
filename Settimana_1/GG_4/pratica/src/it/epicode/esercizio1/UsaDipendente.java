package it.epicode.esercizio1;

public class UsaDipendente {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1110,2200, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente(1111,1800, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente(1112, 1700, Dipartimento.VENDITE);

        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0]=dipendente1;
        dipendenti[1]=dipendente2;
        dipendenti[2]=dipendente3;


        for(int i=0; i<dipendenti.length; i++) {
            System.out.println("Matricola: " + dipendenti[i].getMatricola());
        }
    }
}
