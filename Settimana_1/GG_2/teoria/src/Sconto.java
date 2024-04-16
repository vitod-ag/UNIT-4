import java.util.Scanner;

public class Sconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il prezzo da scontare: ");
        double prezzo = scanner.nextDouble();
        double prezzoFinale = 0;

        if(prezzo<30) {
            prezzoFinale = prezzo - prezzo*12/100;
        } else {
            prezzoFinale = prezzo - prezzo*25/100;
        }
        System.out.println(prezzoFinale);
    }

}
