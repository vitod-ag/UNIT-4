package it.epicode.esercizio2;

public class usaSim {
    public static void main(String[] args) {
        // Creazione di una SIM con numero di telefono
        Sim sim = new Sim(22222222);

        // Impostazione del credito sulla SIM
        sim.setCredito(10);

        // Creazione di un array di chiamate
        Chiamata[] chiamate = new Chiamata[5];
        chiamate[0] = new Chiamata(328965699, 2);
        chiamate[1] = new Chiamata(325145689, 4);
        chiamate[2] = new Chiamata(389664511, 5);
        chiamate[3] = new Chiamata(371669852, 1);
        chiamate[4] = new Chiamata(321456987, 5);

        // Impostazione dell'array di chiamate nella SIM
        sim.setChiamate(chiamate);

        // Stampare i dati della SIM
        sim.stampaDatiSim();
    }
}