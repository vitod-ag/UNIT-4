package dao;

import entity.ClasseStudenti;
import entity.Indirizzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ClasseStudentiDao {

    private EntityManager em;

    public ClasseStudentiDao(EntityManager em) {
        this.em = em;
    }

    public void save(ClasseStudenti classeStudenti) {       // inserisco un elemento Studente nel DB
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(classeStudenti);   //aggiornamento o inserimento
        et.commit();
    }

    public ClasseStudenti getById(int matricola) {
        //non serve aprire una Transition
        ClasseStudenti s = em.find(ClasseStudenti.class,matricola);  // il find sarebbe una SELECT "mascherata"
        return s;
    }

    public void delete(ClasseStudenti classeStudenti) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(classeStudenti);
        et.commit();
    }
}
