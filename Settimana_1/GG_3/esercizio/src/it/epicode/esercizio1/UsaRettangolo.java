package it.epicode.esercizio1;

public class UsaRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(4,6);
        System.out.println();
        System.out.println("L'altezza del primo rettangolo è: " + rettangolo1.getAltezza());
        System.out.println("La larghezza del primo rettangolo è: " + rettangolo1.getLarghezza());
        Rettangolo rettangolo2 = new Rettangolo(5,7);
        System.out.println();
        System.out.println("L'altezza del secondo rettangolo è: " + rettangolo2.getAltezza());
        System.out.println("La larghezza del secondo rettangolo è: " + rettangolo2.getLarghezza());

        System.out.println();
        System.out.println("Rettangolo 1:");
        Rettangolo.stampaRettangolo(rettangolo1);
        System.out.println();
        System.out.println("Rettangolo 2:");
        Rettangolo.stampaRettangolo(rettangolo2);
        System.out.println();

        System.out.println();
        System.out.println("I due rettangoli: ");
        System.out.println();
        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);




    }
}
