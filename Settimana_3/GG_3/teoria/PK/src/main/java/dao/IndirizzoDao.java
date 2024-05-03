package dao;

import entity.Indirizzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class IndirizzoDao {
    private EntityManager em;

    public IndirizzoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Indirizzo indirizzo) {       // inserisco un elemento Studente nel DB
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(indirizzo);   //aggiornamento o inserimento
        et.commit();
    }

    public Indirizzo getById(int matricola) {
        //non serve aprire una Transition
        Indirizzo s = em.find(Indirizzo.class,matricola);  // il find sarebbe una SELECT "mascherata"
        return s;
    }

    public void delete(Indirizzo indirizzo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(indirizzo);
        et.commit();
    }
}
