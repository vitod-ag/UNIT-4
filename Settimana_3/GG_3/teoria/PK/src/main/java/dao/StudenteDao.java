package dao;

import entity.Studente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudenteDao {
    private EntityManager em;

    public StudenteDao(EntityManager em) {
        this.em = em;
    }

    public void save(Studente studente) {       // inserisco un elemento Studente nel DB
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(studente);   //aggiornamento o inserimento
        et.commit();
    }

    public Studente getById(int matricola) {
        //non serve aprire una Transition
        Studente s = em.find(Studente.class,matricola);  // il find sarebbe una SELECT "mascherata"
        return s;
    }

    public void delete(Studente studente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(studente);
        et.commit();
    }




}
