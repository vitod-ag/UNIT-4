import java.util.Scanner;

public class Major {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo intero: ");
        int n1 = scanner.nextInt();
        System.out.println("Inserisci il secondo intero: ");
        int n2 = scanner.nextInt();
        System.out.println("Inserisci il terzo intero: ");
        int n3 = scanner.nextInt();

        /*if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println("Il maggiore dei tre è : " + n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("Il maggiore dei tre è : " + n2);
        } else {
            System.out.println("Il maggiore dei tre è : " + n3);
        }*/

        //secondo metodo
        int max=0;
        if(n1>n2) {
            max=n1;
        } else {
            max=n2;
        }
        if (n3>max){
            max=n3;
        }
        System.out.println("Il maggiore dei tre è : " + max);
    }
}
