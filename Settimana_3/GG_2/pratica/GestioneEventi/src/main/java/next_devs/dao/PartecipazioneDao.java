package next_devs.dao;

import next_devs.evento.Evento;
import next_devs.evento.Partecipazione;
import next_devs.evento.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class PartecipazioneDao {
    private EntityManager em;

    public PartecipazioneDao(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione partecipazione) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(partecipazione);
        et.commit();
    }

    public Partecipazione getById(Integer id) {
        Partecipazione e = em.find(Partecipazione.class, id);
        return e;
    }

    public void delete(Partecipazione partecipazione) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(partecipazione);
        et.commit();
    }

    public List<Persona> getPersonaByEvento(Evento evento) {
        Query query = em.createNamedQuery("getPersonaByEvento");
        query.setParameter("evento", evento);
        return query.getResultList();
    }

    public Number countPersonaByEvento(Evento evento) {
        Query query = em.createQuery("SELECT COUNT(part) FROM Partecipazione part WHERE part.evento= :evento");
        query.setParameter("evento", evento);
        return (Number) query.getSingleResult();
    }

    public List<Persona> getPersonaByPartName(String nome) {
        Query query = em.createQuery(("SELECT p FROM Persona p WHERE p.nome LIKE :nome"));
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }
}
