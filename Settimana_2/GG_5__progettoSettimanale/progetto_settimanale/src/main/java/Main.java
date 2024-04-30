
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Archivio catalogo = new Archivio();
        Rivista rivista1 = new Rivista("AT1001", "Forbes", LocalDate.of(2019, 8, 6),
                57, Periodicita.ANNUALE);
        Rivista rivista2 = new Rivista("AT1002", "Guerin Sportivo", LocalDate.of(2021, 1, 5),
                64, Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("AT1003", "Rolling Stones", LocalDate.of(2015, 11, 9),
                82, Periodicita.SETTIMANALE);

        Libro libro1 = new Libro("IT1004", "Resto qui", LocalDate.of(2022, 10, 6),
                415, "Carofiglio", "Fantasy");
        Libro libro2 = new Libro("IT1005", "Otello", LocalDate.of(2023, 4, 8),
                454, "William Shakespeare", "Horror");
        Libro libro3 = new Libro("IT1006", "Post Office", LocalDate.of(2018, 1, 4),
                530, "Charles Bukowski", "Thriller");

        try {
            catalogo.addProduct(rivista1);
            catalogo.addProduct(rivista2);
            catalogo.addProduct(rivista3);
            catalogo.addProduct(libro1);
            catalogo.addProduct(libro2);
            catalogo.addProduct(libro3);
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        System.out.println(catalogo);

        // Utilizzo dei vari metodi

        Libro libro4 = new Libro("IT1007", "1984",
                LocalDate.of(2018, 4, 14), 650, "George Orwell", "Fantasy");
        try {
            catalogo.addProduct(libro4);
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.searchYearPubblication("2023"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            catalogo.searchAuthor("William Shakespeare");
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.searchPerISBN("AT1003"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            catalogo.removePerISBN("IT1007");
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.searchAuthor("J.R.R. Tolkien"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        // Scrittura del catalogo su file
        scriviCatalogoSuFile(catalogo);
    }

    private static void scriviCatalogoSuFile(Archivio catalogo) {
        File file = new File("./salvataggio/nuovoFile.txt");

        String stringaCatalogo = catalogo.getArchivioCatalogo().values().stream()
                .map(elemento -> {
                    if (elemento instanceof Libro) {
                        return mapLibro((Libro) elemento);
                    } else {
                        return mapRivista((Rivista) elemento);
                    }
                })
                .collect(Collectors.joining("\n")); // Usiamo il carattere di nuova linea come delimitatore

        // Salvataggio su file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(stringaCatalogo);
        } catch (IOException e) {
            logger.error("Errore durante la scrittura su file: " + e.getMessage());
        }
    }

    // Funzione per mappare un libro
    private static String mapLibro(Libro libro) {
        return "Libro: " + libro.getTitolo() +
                ", ISBN: " + libro.getCodiceISBN() +
                ", Anno di pubblicazione: " + libro.getAnnoPubblicazione() +
                ", Numero pagine: " + libro.getNumeroPagine() +
                ", Autore: " + libro.getAutore() +
                ", Genere: " + libro.getGenere();
    }

    // Funzione per mappare una rivista
    private static String mapRivista(Rivista rivista) {
        return  "Rivista: " + rivista.getTitolo() +
                ", ISBN: " + rivista.getCodiceISBN() +
                ", Anno di pubblicazione: " + rivista.getAnnoPubblicazione() +
                ", Numero pagine: " + rivista.getNumeroPagine() +
                ", Periodicità: " + rivista.getPeriodicita();
    }
}