import java.util.Scanner;

public class NumeriFinoA0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int i = 0;
        int numero = 0;
//        do{
//            System.out.println("Digita un numero:");
//            numero = scanner.nextInt();
//            somma = somma + numero;
//            i++;
//        }while(numero!=0);

        System.out.println("Digita un numero:");
        numero = scanner.nextInt();

        while (numero!=0) {
            somma = somma + i;
            i++;
            System.out.println("Digita un numero:");
            numero = scanner.nextInt();
        }

    double average = (double) somma /(i);
    System.out.println(average);

    }
}
