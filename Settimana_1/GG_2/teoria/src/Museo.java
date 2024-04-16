import java.util.Scanner;

public class Museo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un opzione tra 1 e 4");
        int scelta = scanner.nextInt();

//        double costoBiglietto = 0;
//
//        if(scelta==1) {
//            costoBiglietto = 0;
//        } else if (scelta==2) {
//            costoBiglietto=8;
//        }else if (scelta==3) {
//            costoBiglietto=10;
//        }else if (scelta==4) {
//            costoBiglietto=12;
//        } else {
//            System.out.println("Scelta errata");
//            return;
//        }
//        System.out.println("Inserisci l'età: ");
//        int eta = scanner.nextInt();
//
//        if(eta<=18) {
//            costoBiglietto=costoBiglietto - costoBiglietto*50/100;
//        }
//        System.out.println(costoBiglietto);

        switch (scelta) {
            case 1:
                System.out.println("Biglietto gratuito");
                break;
            case 2:
                System.out.println("Costo biglietto 8€");
                break;
            case 3:
                System.out.println("Costo biglietto 10€");
                break;
            case 4:
                System.out.println("Costo biglietto 15€");
                break;
            default:
                System.out.println("Scelta errata");
        }
    }
}
