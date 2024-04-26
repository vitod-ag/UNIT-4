import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Esercitazione {
    public static void main(String[] args) {

        // mi creo tutti il libri
        Product libro1 = new Product(1L, "Il vecchio e il mare", "Books", 120.0);
        Product libro2 = new Product(2L, "Resto qui", "Books", 25.0);
        Product libro3 = new Product(3L, "Post Office", "Books", 80.0);
        Product libro4 = new Product(4L, "Otello", "Books", 150.0);
        Product libro5 = new Product(5L, "Il mercante di Venezia", "Books", 50.0);
        // mi creo tutti i prodotti per Baby
        Product baby1 = new Product(10L, "Pannolino", "Baby", 15.5);
        Product baby2 = new Product(11L, "Culla", "Baby", 90.0);
        Product baby3 = new Product(12L, "Biberon", "Baby", 50.5);
        Product baby4 = new Product(13L, "Bavaglino", "Baby", 16.0);
        Product baby5 = new Product(14L, "Seggiolino", "Baby", 15.5);
        // mi creo tutti i prodotti per i Boys
        Product boys1 = new Product(21L, "T-shirt", "Boys", 15.50);
        Product boys2 = new Product(22L, "Pantalone cargo", "Boys", 36.60);
        Product boys3 = new Product(23L, "Cappello da baseball", "Boys", 5.20);
        Product boys4 = new Product(24L, "Giubetto di pelle", "Boys", 55.50);
        Product boys5 = new Product(25L, "Collana placcata", "Boys", 10.00);

        //mi creo una lista di questi prodotti
        List<Product> products = List.of(libro1, libro2, libro3, libro4, libro5, baby1, baby2, baby3, baby4, baby5, boys1, boys2, boys3, boys4, boys5);

        // mi creo i Clienti(custumers)
        Customer cliente1 = new Customer(501, "Mario", 2);
        Customer cliente2 = new Customer(502, "Carlo", 1);
        Customer cliente3 = new Customer(503, "Sara", 2);
        Customer cliente4 = new Customer(504, "Valerio", 1);
        Customer cliente5 = new Customer(505, "Angela", 2);

        // metto i clienti anche loro in una lista immutabile come prima per i prodotti
        List<Customer> clienti = List.of(cliente1, cliente2, cliente3, cliente4, cliente5);


        //infine creo gli ordini facendo attenzione al fatto che gli ordini hanno sia prodotti che clienti
        Order order1 = new Order(9L, "In attesa", LocalDate.of(2021, 2, 10), LocalDate.of(2021, 3, 10), List.of(libro2, libro4, baby2), cliente3);
        Order order2 = new Order(10L, "Aperto", LocalDate.of(2021, 1, 10), LocalDate.of(2021, 3, 10), List.of(libro5, libro1, boys1), cliente4);
        Order order3 = new Order(11L, "In attesa", LocalDate.of(2021, 2, 10), LocalDate.of(2021, 3, 20), List.of(libro4, baby4, boys4), cliente1);
        Order order4 = new Order(12L, "Chiuso", LocalDate.of(2021, 2, 20), LocalDate.of(2021, 3, 10), List.of(libro2, baby3, baby2), cliente5);
        Order order5 = new Order(13L, "Aperto", LocalDate.of(2021, 1, 20), LocalDate.of(2021, 2, 10), List.of(libro4, libro2, boys4), cliente2);
        //metto gli ordini nella solita List.of
        List<Order> ordini = List.of(order1, order2, order3, order4, order5);

        //Esercizio #1
        //Raggruppare gli ordini per cliente utilizzando Stream e Lambda Expressions.
        // Crea una mappa in cui la chiave è il cliente e il valore è una lista di ordini effettuati da quel cliente
        System.out.println("---------------------");
        System.out.println("\nEsercizio_1");
        Map<Customer, List<Order>> map1 = ordini.stream().collect(Collectors.groupingBy(Order::getCustomer));
        map1.forEach((cliente, orders) -> System.out.println(cliente + " -> " + orders));

        //Esercizio #2
        //Dato un elenco di ordini, calcola il totale delle vendite per ogni cliente utilizzando Stream e Lambda Expressions.
        //Crea una mappa in cui la chiave è il cliente e il valore è l'importo totale dei suoi acquisti

        System.out.println("\nEsercizio_2");
        Map<Customer, Double> customerTotalSales = ordini.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum())));
        customerTotalSales.forEach((customer, totalSales) -> System.out.println(customer.getName() + " ha speso un totale di " + totalSales + " €."));


        //Esercizio #3
        //Dato un elenco di prodotti, trova i prodotti più costosi utilizzando Stream e Lambda Expressions
        System.out.println("\nEsercizio_3");
        Map<String, Optional<Product>> map3 = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));
        map3.forEach((category, productMax) -> System.out.println(category + " -> " + productMax.get()));

//      Esercizio #4
//      Dato un elenco di ordini, calcola la media degli importi degli ordini utilizzando Stream e Lambda Expressions
        System.out.println("\nEsercizio_4");
        Double media2 = ordini.stream().collect(Collectors.averagingDouble(value -> value.getProducts().stream().mapToDouble(Product::getPrice).sum()));
        System.out.println(media2);

//      [EXTRA] Esercizio #6
//      Usando la classe Apache Commons IO FileUtils implementare un metodo salvaProdottiSuDisco che salvi su disco un file contenente la lista dei prodotti. Utilizzare un formato simile al seguente per storicizzare i dati su file:
//      nomeprodotto1@categoriaprodotto1@prezzoprodotto1#nomeprodotto2@categoriaprodotto2@prezzoprodotto2
        System.out.println("\nEsercizio_6");
        String productsString = products.stream().map((product -> product.getId().
                longValue()+"@"+product.getCategory()+"@" +product.getPrice())).collect(Collectors.joining("#"));
        System.out.println(productsString);

        System.out.println("\nEsercizio_7");

        File file = new File("./../persistence/prova.txt");
        try {
            FileUtils.writeStringToFile(file,productsString, Charset.defaultCharset());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try {
            String str = FileUtils.readFileToString(file,Charset.defaultCharset());
            String[] prodottiStr = str.split("#");
            Arrays.stream(prodottiStr).forEach(s-> System.out.println(s));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}

