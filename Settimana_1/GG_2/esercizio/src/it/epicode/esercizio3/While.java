package it.epicode.esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi una parola");
        String parola = scanner.nextLine();

        while (!parola.equals(":q")) {

            for (int i = 0; i < parola.length(); i++) {
                System.out.print(parola.charAt(i));
                if (i != parola.length() - 1)
                    System.out.print(",");
            }
            System.out.println();

            String newParola = "";


            System.out.println(newParola);


            System.out.println("Dammi una parola");
            parola = scanner.nextLine();
        }

    }
}

//            for (int i=0; i<parola.length(); i++){
//                newParola = newParola + parola.charAt(i);
//
//                if(i!=parola.length()-1){
//                    newParola = newParola + ",";
//                }
//            }