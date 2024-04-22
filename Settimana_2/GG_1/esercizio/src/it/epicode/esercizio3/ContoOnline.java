package it.epicode.esercizio3;

public class ContoOnline extends ContoCorrente{
    double maxPrelievo;

    ContoOnline(String titolare, double saldo) {
        super(titolare, saldo);
    }


    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException{
        if (x <= maxPrelievo) {
            super.preleva(x);
        } else throw new BancaException("Hai superato il limite");
    }
}
