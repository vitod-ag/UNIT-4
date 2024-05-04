package next_devs.DAO;

import next_devs.Entity.Libro;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class LibroDao {
    private EntityManager em;

    public LibroDao(EntityManager em) {
        this.em = em;
    }

    public void save(Libro libro) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(libro);
        et.commit();
    }

    public Libro getById(Integer id) {
        return em.find(Libro.class, id);
    }

    public void delete(Libro libro) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(libro);
        et.commit();
    }

    public void update(Libro libro) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(libro);
        et.commit();
    }

    public List<Libro> findAll() {
        return em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
    }
}
