package it.next_devs;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // mi creo tutti il libri
        Product libro1 = new Product(1L,"Il vecchio e il mare", "Books",120.0);
        Product libro2 = new Product(2L,"Resto qui", "Books",25.0);
        Product libro3 = new Product(3L,"Post Office", "Books",80.0);
        Product libro4 = new Product(4L,"Otello", "Books",150.0);
        Product libro5 = new Product(5L,"Il mercante di Venezia", "Books",50.0);
        // mi creo tutti i prodotti per Baby
        Product baby1 = new Product(10L,"Pannolino","Baby",15.5);
        Product baby2 = new Product(11L,"Culla","Baby",90.0);
        Product baby3 = new Product(12L,"Biberon","Baby",50.5);
        Product baby4 = new Product(13L,"Bavaglino","Baby",16.0);
        Product baby5 = new Product(14L,"Seggiolino","Baby",15.5);
        // mi creo tutti i prodotti per i Boys
        Product boys1 = new Product(21L,"T-shirt","Boys",15.50);
        Product boys2 = new Product(22L,"Pantalone cargo","Boys",36.60);
        Product boys3 = new Product(23L,"Cappello da baseball","Boys",5.20);
        Product boys4 = new Product(24L,"Giubetto di pelle","Boys",55.50);
        Product boys5 = new Product(25L,"Collana placcata","Boys",10.00);

        //mi creo una lista di questi prodotti
        List<Product> products = List.of(libro1,libro2,libro3,libro4,libro5,baby1,baby2,baby3,baby4,baby5,boys1,boys2,boys3,boys4,boys5);

        // mi creo i Clienti(custumers)
        Customer cliente1 = new Customer(501,"Mario",2);
        Customer cliente2 = new Customer(502,"Carlo",1);
        Customer cliente3 = new Customer(503,"Sara",2);
        Customer cliente4 = new Customer(504,"Valerio",1);
        Customer cliente5 = new Customer(505,"Angela",2);

        // metto i clienti anche loro in una lista immutabile come prima per i prodotti
        List<Customer> clienti = List.of(cliente1,cliente2,cliente3,cliente4,cliente5);


        //infine creo gli ordini facendo attenzione al fatto che gli ordini hanno sia prodotti che clienti
        Order order1 = new Order(9L,"In attesa", LocalDate.of(2021,2,10),LocalDate.of(2021,3,10),
                List.of(libro2,libro4,baby2),cliente3);
        Order order2 = new Order(10L,"Aperto", LocalDate.of(2021,1,10),LocalDate.of(2021,3,10),
                List.of(libro5,libro1,boys1),cliente4);
        Order order3 = new Order(11L,"In attesa", LocalDate.of(2021,2,10),LocalDate.of(2021,3,20),
                List.of(libro4,baby4,boys4),cliente1);
        Order order4 = new Order(12L,"Chiuso", LocalDate.of(2021,2,20),LocalDate.of(2021,3,10),
                List.of(libro2,baby3,baby2),cliente5);
        Order order5 = new Order(13L,"Aperto", LocalDate.of(2021,1,20),LocalDate.of(2021,2,10),
                List.of(libro4,libro2,boys4),cliente2);
        //metto gli ordini nella solita List.of
        List<Order> ordini = List.of(order1,order2,order3,order4,order5);

        //------------------------------------------

        System.out.println("\n---Esercizio_1---");
        //Esercizio #1
        //Ottenere una lista di prodotti che appartengono alla categoria «Books» ed hanno un prezzo > 100
        List<Product> l1 = products.stream().filter(prodotto->prodotto.getCategory().equals("Books")&&prodotto.getPrice()>100).toList();

        l1.forEach(product -> System.out.println(product.getName()));

        System.out.println("\n---Esercizio_2---");
        //Esercizio #2
        //Ottenere una lista di ordini con prodotti che appartengono alla categoria «Baby»
        List<Order> l2 = ordini.stream().filter(order -> order.getProducts().stream().anyMatch((product -> product.getCategory().equals("Baby")))).collect(Collectors.toList());

        l2.forEach(order -> System.out.println(order.getId()));

        System.out.println("\n---Esercizio_3---");
        //Esercizio #3
        //Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo

        List<Product> l3 = products.stream().filter(product -> product.getCategory().equals("Boys")).peek(product -> product.setPrice(product.getPrice()*0.9)).collect(Collectors.toList());

        l3.forEach(product -> System.out.println(product));

        System.out.println("\n---Esercizio_4---");
        //Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l’01-Feb-2021 e l’01-Apr-2021

        //parto da ordini anche se la lista è di tipo Product
        List<Product> l4 =  ordini.stream().filter(order -> order.getCustomer().getTier()==2 &&
                order.getOrderDate().isAfter(LocalDate.of(2021,1,31)) &&
                order.getDeliveryDate().isBefore(LocalDate.of(2021,4,2)))
                .flatMap(order -> order.getProducts().stream()).collect(Collectors.toList());

        l4.forEach(product -> System.out.println(product.getName()));

    }
}