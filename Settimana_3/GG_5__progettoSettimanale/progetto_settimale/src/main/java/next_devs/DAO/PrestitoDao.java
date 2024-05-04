package next_devs.DAO;

import next_devs.Entity.Catalogo;
import next_devs.Entity.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.List;

public class PrestitoDao {
    private EntityManager em;

    public PrestitoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(prestito);
        et.commit();
    }

    public Prestito getById(Integer id) {
        return em.find(Prestito.class, id);
    }

    public void delete(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(prestito);
        et.commit();
    }

    public void update(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(prestito);
        et.commit();
    }


    public List<Catalogo> getProductFromId (Integer Id) {
        return em.createQuery("SELECT pr FROM Prestito pr", Prestito.class)
                .getResultStream()
                .map(Prestito::getCatalogo)
                .toList();
    }

    public List<Prestito> getPrestitoScadutoNonConsegnato() {
        LocalDate today = LocalDate.now();
        return em.createQuery("SELECT pr FROM Prestito pr WHERE pr.dataRestituzioneEffettiva IS NULL OR " +
                "pr.dataRestituzionePrevista < :today", Prestito.class)
                .setParameter("today", today)
                .getResultList();
    }
}
