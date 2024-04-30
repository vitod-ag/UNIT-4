package next_devs;

import next_devs.dao.EventoDao;
import next_devs.evento.Evento;
import next_devs.evento.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestore_eventi");
        EntityManager em = emf.createEntityManager();

        EventoDao eventoDao = new EventoDao(em);
        Evento evento1 = new Evento();

        evento1.setTitolo("Festa aziendale");
        evento1.setDataEvento(LocalDate.of(2015,12,23));
        evento1.setDescrizione("Cena natalizia");
        evento1.setTipoEvento(TipoEvento.PRIVATO);
        evento1.setNumeroMassimoPartecipanti(40);
        //eventoDao.save(evento1);

        Evento evento2 = new Evento();
        evento2.setTitolo("Carnevale di Rio");
        evento2.setDataEvento(LocalDate.of(2020,12,19));
        evento2.setDescrizione("Cena natalizia");
        evento2.setTipoEvento(TipoEvento.PUBBLICO);
        evento2.setNumeroMassimoPartecipanti(25);
        //eventoDao.save(evento2);

        Evento evento3 = eventoDao.getById(1);

        evento1.setDescrizione("Degustazione vini");
        //eventoDao.save(evento1);

        eventoDao.delete(evento3);
        eventoDao.delete(evento1);


    }
}
