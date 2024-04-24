package Lambda;


import java.util.ArrayList;
import java.util.List;

public class ProvaLambda4 {
    public static void main(String[] args) {
        List<Integer> numeroImmutabile = List.of(2,4,7,6,9,95,74);  // è immutabile facendo of

        ArrayList<Integer> numeri = new ArrayList<>(numeroImmutabile);
        numeri.sort((i1,i2) -> i1.compareTo(i2));
        numeri.forEach(s -> System.out.println(s));
        System.out.println();
        numeri.replaceAll(intero -> intero+10);
        numeri.forEach(intero -> System.out.println(intero));
    }
}
