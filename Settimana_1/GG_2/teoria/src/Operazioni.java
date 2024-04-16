import java.util.Scanner;

public class Operazioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Inserisci l'operazione: ");
        char operazione = scanner.next().charAt(0); //next restituisce una stringa usando solo la prima parola mentre charAt() prende solo il carattere nelle tonde
        System.out.println("Inserisci il risultato: ");
        int risultato = scanner.nextInt();


        int risultatoCorretto = 0;
        if(operazione=='+') {
            risultatoCorretto = n1+n2;
        } else if (operazione == '-') {
            risultatoCorretto = n1-n2;
        } else if (operazione == '*') {
            risultatoCorretto = n1*n2;
        } else {
            risultatoCorretto = n1/n2;
        }
        if(risultatoCorretto==risultato) {
            System.out.println("Esatto. " + risultatoCorretto + " è il risultato corretto");
        } else {
            System.out.println("Risultato errato. Il risultato giusto è " + risultatoCorretto);
        }
    }
}
