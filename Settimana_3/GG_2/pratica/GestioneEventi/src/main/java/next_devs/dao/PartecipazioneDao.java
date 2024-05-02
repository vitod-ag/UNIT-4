package next_devs.dao;

import next_devs.evento.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
}
