package it.epicode.esercizio3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Carlo Rossi","47559612");
        rubrica.inserisciContatto("Mario Bianchi","254592265");
        rubrica.inserisciContatto("Marco Verdi","837480039347");

        rubrica.stampaRubrica();
        System.out.println(rubrica);

        rubrica.rimuoviContatto("Mario Bianchi");
    }
}
