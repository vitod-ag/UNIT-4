import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Logger logger = LoggerFactory.getLogger("Logger_1");
    public static void main(String[] args) {
        System.out.println();
        logger.warn("Sto lanciando l'applicazione");
        System.out.println("\n**Teoria UNIT4 W2 D1**");
        Aritmetica aritmetica = new Aritmetica();
        // meglio gestire l'eccezione nel main se il metodo è operativo e basta
        try {
            System.out.println(aritmetica.divisione(9, 3));
        }catch (ArithmeticException e) {  // se scrivessi Exception comprenderei TUTTO e non servirebbe fare altri catch
            System.out.println("Divisione per 0 non ammessa");
        }catch (DivisionePerZeroException e) { // questo cacth deve essere messo per forza per gestire il metodo divisione che ha il throws
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Programma terminato da Exception");
        }
        logger.info("Programma terminato");
    }
}