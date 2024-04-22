package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    static Logger logger = LoggerFactory.getLogger("logger");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Inserisci quanti km: ");
        double km = scanner.nextDouble();
        logger.info("Inserisci quanti litri: ");
        double litro = scanner.nextDouble();

        try {
            logger.info("Il consumo effettuato è: " + CalcoloConsumo.consumo(km,litro) + "km/litro");
        }catch (LitriUgualeZero e) {
            logger.error("Errore: " + e.getMessage());
        }
    }
}
