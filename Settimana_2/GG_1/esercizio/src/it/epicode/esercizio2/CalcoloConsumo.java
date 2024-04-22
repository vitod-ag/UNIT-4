package it.epicode.esercizio2;

public class CalcoloConsumo  {
    public CalcoloConsumo() {
    }
    public static double consumo(double km, double litro) throws LitriUgualeZero {
        double calcolo;
        if ( litro == 0 ) {
            throw new LitriUgualeZero("Impossibile effettuare il calcolo");
        }else {
            calcolo = km/litro;
        }
        return calcolo;
    }

}
