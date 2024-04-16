package it.epicode.esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String string = scanner.nextLine();

        String newString = suddivide(string);
        System.out.println("La nuova stringa suddivisa con virgole: " + newString);
    }

    public static String suddivide(String stringa) {
        int i=0;
        StringBuilder result = new StringBuilder();

        while (i<stringa.length()){
            result.append(stringa.charAt(i));
            if (i!=stringa.length()-1) {
                result.append(",");
            }
            i++;
        }
        return result.toString();
    }
}
