package next_devs;

import next_devs.dao.EventoDao;
import next_devs.dao.LocationDao;
import next_devs.dao.PartecipazioneDao;
import next_devs.dao.PersonaDao;
import next_devs.evento.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestore_eventi");
        EntityManager em = emf.createEntityManager();

        EventoDao eventoDao = new EventoDao(em);
        LocationDao locationDao = new LocationDao(em);
        PersonaDao personaDao = new PersonaDao(em);
        PartecipazioneDao partecipazioneDao = new PartecipazioneDao(em);


//        Evento evento1 = new Evento();
//        evento1.setTitolo("Festa aziendale");
//        evento1.setDataEvento(LocalDate.of(2015,12,23));
//        evento1.setDescrizione("Cena natalizia");
//        evento1.setTipoEvento(TipoEvento.PRIVATO);
//        evento1.setNumeroMassimoPartecipanti(40);
//        eventoDao.save(evento1);
//
//        Location location = new Location();
//        location.setNome("Circo Massimo");
//        location.setCitta("Roma");
//        locationDao.save(location);
//
//        evento1.setLocation(location);
//        eventoDao.save(evento1);
//
//        Evento evento2 = new Evento();
//        evento2.setTitolo("Carnevale di Rio");
//        evento2.setDataEvento(LocalDate.of(2020,12,19));
//        evento2.setDescrizione("Cena natalizia");
//        evento2.setTipoEvento(TipoEvento.PUBBLICO);
//        evento2.setNumeroMassimoPartecipanti(25);
//        eventoDao.save(evento2);
//
//
//
//
//        Persona p1 = new Persona();
//        p1.setNome("Dario");
//        p1.setCognome("Sellitti");
//        p1.setEmail("dario@sellitti.com");
//        p1.setSesso(Sex.M);
//        personaDao.save(p1);
//
//        Persona p2 = new Persona();
//        p2.setNome("Mario");
//        p2.setCognome("Stanco");
//        p2.setEmail("mario@stanco.com");
//        p2.setSesso(Sex.F);
//        personaDao.save(p2);
//
//        Partecipazione partecipazione = new Partecipazione();
//        partecipazione.setEvento(evento2);
//        partecipazione.setPersona(p1);
//        partecipazione.setStato(Stato.DA_CONFERMARE);
//        partecipazioneDao.save(partecipazione);
//
//
//        Partecipazione partecipazione2 = new Partecipazione();
//        partecipazione2.setEvento(evento2);
//        partecipazione2.setPersona(p2);
//        partecipazione2.setStato(Stato.DA_CONFERMARE);
//        partecipazioneDao.save(partecipazione2);

        personaDao.getPersonaByName("Dario").forEach(System.out::println);

        personaDao.getPersonaByCognome("Stanco").forEach(System.out::println);


        System.out.println();
        Evento evento = eventoDao.getById(20);
        partecipazioneDao.getPersonaByEvento(evento).forEach(System.out::println);

        System.out.println();
        System.out.println(partecipazioneDao.countPersonaByEvento(evento));

        System.out.println();
        partecipazioneDao.getPersonaByPartName("o").forEach(System.out::println);

//        PartitaDiCalcio partitaDiCalcio = new PartitaDiCalcio();
//        partitaDiCalcio.setSquadraCasa("Inter");
//        partitaDiCalcio.setSquadraOspite("Verona");
//        partitaDiCalcio.setSquadraVincente("Inter");
//        partitaDiCalcio.setGoalCasa(2);
//        partitaDiCalcio.setGoalOspite(1);
//        partitaDiCalcio.setDescrizione("Inter-Verona");
//        partitaDiCalcio.setTitolo("Partita Serie A");
//        partitaDiCalcio.setNumeroMassimoPartecipanti(75000);
//        partitaDiCalcio.setDataEvento(LocalDate.of(2016,9,8));
//        eventoDao.save(partitaDiCalcio);

        Concerto concerto = new Concerto();
        concerto.setGenere(Genere.POP);
        concerto.setInStreaming(false);
        concerto.setTitolo("Ron on Tour");
        concerto.setDescrizione("Concerto Ron");
        concerto.setDataEvento(LocalDate.of(2023,8,2));
        concerto.setNumeroMassimoPartecipanti(2400);
        concerto.setTipoEvento(TipoEvento.PUBBLICO);
        eventoDao.save(concerto);


        // al posto di fare il metodo lo faccio qua
//        Query query = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming= :valore");
//        Query query2 = em.createQuery("SELECT c FROM Concerto c WHERE c.genere= :valore");

        // sarebbe una Named Query
//        Query query3 = em.createQuery("SELECT p FROM PartitaDiCalcio p WHERE p.goalCasa>p.goalOspite");
//        Query query4 = em.createQuery("SELECT g FROM GaraDiAtletica g WHERE g.vincitore= :persona");


    }
}
