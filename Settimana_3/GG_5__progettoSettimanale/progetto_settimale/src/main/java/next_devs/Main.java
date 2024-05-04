package next_devs;

import next_devs.DAO.*;
import next_devs.Entity.*;
import next_devs.Enums.Periodicita;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
        EntityManager em = emf.createEntityManager();

        LibroDao libroDao = new LibroDao(em);
        CatalogoDao catalogoDao = new CatalogoDao(em);
        RivistaDao rivistaDao = new RivistaDao(em);
        UtenteDao utenteDao = new UtenteDao(em);
        PrestitoDao prestitoDao = new PrestitoDao(em);

        //****1.Aggiunta di un elemento del catalogo******;
        // creo i libri
        Libro l1 = new Libro();
        l1.setCodiceISBN("AO001A");
        l1.setTitolo("Modernità liquida");
        l1.setAnnoPubblicazione(2014);
        l1.setNumeroPagine(450);
        l1.setAutore("Zygmunt Bauman");
        l1.setGenere("Attualità, inchiesta");
        try {
            libroDao.save(l1);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }


        Libro l2 = new Libro();
        l2.setCodiceISBN("AO001B");
        l2.setTitolo("Il mercante di Venezia");
        l2.setAnnoPubblicazione(1998);
        l2.setNumeroPagine(180);
        l2.setAutore("William Shakespeare");
        l2.setGenere("Romanzo");
        try {
            libroDao.save(l2);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }

        Libro l3 = new Libro();
        l3.setCodiceISBN("AO001C");
        l3.setTitolo("Resto qui");
        l3.setAnnoPubblicazione(2018);
        l3.setNumeroPagine(250);
        l3.setAutore("Marco Balzano");
        l3.setGenere("Saggio");
        try {
            libroDao.save(l3);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }

        // creo le riviste
        Rivista r1 = new Rivista();
        r1.setCodiceISBN("B0001A");
        r1.setTitolo("Forbes");
        r1.setNumeroPagine(50);
        r1.setPeriodicita(Periodicita.MENSILE);
        r1.setAnnoPubblicazione(2009);
        try {
            rivistaDao.save(r1);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }

        Rivista r2 = new Rivista();
        r2.setCodiceISBN("B0001B");
        r2.setTitolo("Guerin Sportivo");
        r2.setNumeroPagine(30);
        r2.setPeriodicita(Periodicita.SETTIMANALE);
        r2.setAnnoPubblicazione(2020);
        try {
            rivistaDao.save(r2);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }

        Rivista r3 = new Rivista();
        r3.setCodiceISBN("B0001C");
        r3.setTitolo("Chi");
        r3.setNumeroPagine(25);
        r3.setPeriodicita(Periodicita.ANNUALE);
        r3.setAnnoPubblicazione(1999);
        try {
            rivistaDao.save(r3);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }


        // 2. Rimozione di un elemento del catalogo dato un codice ISBN
        try {
            Catalogo catalogo = catalogoDao.getById("693");
            if (catalogo != null) {
                catalogoDao.delete(catalogo);
                System.out.println("Prodotto eliminato");
            } else {
                throw new RuntimeException("Prodotto inesistente");
            }
        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }

        try {
            Catalogo catalogo = catalogoDao.getById("AO001C");
            if (catalogo != null) {
                catalogoDao.delete(catalogo);
                System.out.println("Prodotto eliminato");
            } else {
                throw new RuntimeException("Prodotto inesistente");
            }
        } catch (
                Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }

        System.out.println("3. Ricerca per ISBN");
        Catalogo findCatalogo = catalogoDao.getById("AO001A");
        System.out.println(findCatalogo);

        System.out.println("4. Ricerca per anno pubblicazione");
        List<Catalogo> cataloghiByYear = catalogoDao.findByYear(2005);
        cataloghiByYear.forEach(System.out::println);

        System.out.println("5. Ricerca per autore");
        List<Catalogo> catalogoByAutore = catalogoDao.findByAuthor("Bauman");
        catalogoByAutore.forEach(System.out::println);

        System.out.println("6. Ricerca per titolo o parte di esso");
        List<Catalogo> catalogoByTitle = catalogoDao.findByTitle("liquida");
        catalogoByTitle.forEach(System.out::println);

        // creo gli utenti
        Utente u1 = new Utente();
        u1.setNome("Mario");
        u1.setCognome("Ventola");
        u1.setDataNascita(LocalDate.of(1999, 2, 7));
        try {
            utenteDao.save(u1);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        Utente u2 = new Utente();
        u1.setNome("Michele");
        u1.setCognome("Nanni");
        u1.setDataNascita(LocalDate.of(2003, 4, 12));
        try {
            utenteDao.save(u2);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        Utente u3 = new Utente();
        u3.setNome("Nicola");
        u3.setCognome("Brogi");
        u3.setDataNascita(LocalDate.of(1995, 8, 1));
        try {
            utenteDao.save(u3);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        // mi creo i prestiti
        Prestito pr1 = new Prestito();
        pr1.setUtente(utenteDao.getById(1));
        pr1.setDataInizioPrevisto(LocalDate.now());
        pr1.setCatalogo(catalogoDao.getById("AO001A"));
        try {
            prestitoDao.save(pr1);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        Prestito pr2 = new Prestito();
        pr2.setUtente(utenteDao.getById(2));
        pr2.setDataInizioPrevisto(LocalDate.now());
        pr2.setCatalogo(catalogoDao.getById("AO001B"));
        try {
            prestitoDao.save(pr2);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        Prestito pr3 = new Prestito();
        pr3.setUtente(utenteDao.getById(2));
        pr3.setDataInizioPrevisto(LocalDate.now());
        pr3.setCatalogo(catalogoDao.getById("B0001C"));
        try {
            prestitoDao.save(pr3);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        System.out.println("7. Ricerca degli elementi attualmente in prestito dato un numero di tessera utente");
        List<Catalogo> prodottiPrestito = prestitoDao.getProductFromId(2);
        prodottiPrestito.forEach(System.out::println);

        System.out.println("8. Ricerca di tutti i prestiti scaduti e non ancora restituiti");
        List<Prestito> prestitiNonRestituiti = prestitoDao.getPrestitoScadutoNonConsegnato();
        prestitiNonRestituiti.forEach(System.out::println);

    }
}