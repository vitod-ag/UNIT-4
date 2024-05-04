package dao;

import entity.ClasseStudenti;
import entity.Corso;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CorsoDao {

    private EntityManager em;

    public CorsoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Corso corso) {       // inserisco un elemento Studente nel DB
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(corso);   //aggiornamento o inserimento
        et.commit();
    }

    public Corso getById(int corso) {
        //non serve aprire una Transition
        Corso s = em.find(Corso.class,corso);  // il find sarebbe una SELECT "mascherata"
        return s;
    }

    public void delete(Corso corso) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(corso);
        et.commit();
    }
}
