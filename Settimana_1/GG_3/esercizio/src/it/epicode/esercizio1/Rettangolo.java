package it.epicode.esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza=altezza;
        this.larghezza=larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    private double calcolaPerimetro() {
        return (altezza+larghezza)*2;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Perimetro: " + r.calcolaPerimetro());
        System.out.println("Area: " + r.calcolaArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo rettangolo:");
        stampaRettangolo(r1);
        System.out.println("Secondo rettangolo:");
        stampaRettangolo(r2);
        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri =  r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma delle perimetri: " + sommaPerimetri);
    }
}
