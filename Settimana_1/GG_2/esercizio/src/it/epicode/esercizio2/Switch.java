package it.epicode.esercizio2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero:");
        int num = scanner.nextInt();
        String result =  daInteroALettera(num);
    }

    public static String daInteroALettera (int num) {
        String result = "";
        switch(num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore");
        }
        return result;
    }
}
