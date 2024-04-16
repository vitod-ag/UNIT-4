package it.epicode.esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String string = scanner.nextLine();

        while (!string.equals(":q")) {
            for (int i=0; i<string.length(); i++) {
                System.out.print(string.charAt(i));
                if (i!=string.length()-1){
                    System.out.print(",");
                }
            }
            System.out.println();

            System.out.println("Inserire una stringa");
            string = scanner.nextLine();

        }
    }
}



