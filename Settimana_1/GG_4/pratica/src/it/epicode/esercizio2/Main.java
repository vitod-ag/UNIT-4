package it.epicode.esercizio2;



public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = new DipendenteFullTime(1487, Dipartimento.AMMINISTRAZIONE);
        dipendenti[1] = new DipendetePartTime(1658, Dipartimento.PRODUZIONE);
        dipendenti[2] = new Dirigente(75856,  Dipartimento.VENDITE);



        for(int i=0; i<dipendenti.length; i++) {
            dipendenti[i].calcolaStipendio(9);
            System.out.println("Dipendente: " + dipendenti[i].getStipendio());
        }
    }
}
