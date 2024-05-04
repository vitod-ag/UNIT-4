package next_devs.DAO;

import next_devs.Entity.Catalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CatalogoDao {
    private EntityManager em;

    public CatalogoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Catalogo catalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(catalogo);
        et.commit();
    }

    public Catalogo getById(String codiceISBN) {
        return em.find(Catalogo.class, codiceISBN);
    }

    public void delete(Catalogo catalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(catalogo);
        et.commit();
    }

    public void update(Catalogo catalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(catalogo);
        et.commit();
    }

    public List<Catalogo> findAll() {
        return em.createQuery("SELECT ctg FROM Catalogo ctg", Catalogo.class).getResultList();
    }

    public List<Catalogo>findByYear(Integer anno){
        return em.createQuery("SELECT ctg FROM Catalogo ctg WHERE anno_pubblicazione= :anno ", Catalogo.class)
                .setParameter("anno",anno)
                .getResultList();
    }

    public List<Catalogo>findByTitle(String titolo){
        return em.createQuery("SELECT ctg FROM Catalogo ctg WHERE titolo LIKE :titolo", Catalogo.class)
                .setParameter("titolo", "%" + titolo + "%")
                .getResultList();
    }

    public List<Catalogo> findByAuthor(String author){
        return em.createQuery("SELECT ctg FROM Catalogo ctg WHERE autore LIKE :autore ", Catalogo.class)
                .setParameter("autore","%" + author + "%")
                .getResultList();
    }
}
