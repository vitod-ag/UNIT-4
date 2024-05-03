package next_devs.dao;

import next_devs.evento.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class PersonaDao {
    private EntityManager em;

    public PersonaDao(EntityManager em) {
        this.em = em;
    }

    public void save(Persona persona) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(persona);
        et.commit();
    }

    public Persona getById(Integer id) {
        Persona e = em.find(Persona.class, id);
        return e;
    }

    public void delete(Persona persona) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(persona);
        et.commit();
    }

    // metodo collegato alla Named Query di Persona
    public List<Persona> getPersonaByName(String nome) {
        Query query = em.createNamedQuery("getPersonaByName");
        query.setParameter("nome", nome);
        return query.getResultList();
    }

    // faccio una Dynamic Query senza farla da altre parti ma solo qui
    public List<Persona> getPersonaByCognome(String cognome) {
       Query query = em.createQuery("SELECT p FROM Persona p WHERE p.cognome = :cognome");
       query.setParameter("cognome", cognome);
       return query.getResultList();
    }
}
