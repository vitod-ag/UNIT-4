package epicode;

import epicode.dao.StudenteDao;
import epicode.entity.Studente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("epicode_jpa");
        EntityManager em = emf.createEntityManager();

        StudenteDao dao = new StudenteDao(em);
        Studente s1 = new Studente();

        s1.setNome("Nino");
        s1.setCognome("Salvini");
        s1.setIndirizzo("Via dei Tali, 11");
        s1.setDataNascita(LocalDate.of(2000,12,11));
        //dao.save(s1);

        Studente s2 = dao.getById(1);
        System.out.println(s2);

        s2.setIndirizzo("Piazza Roma, 54");
        //dao.save(s2);

        dao.delete(s2);

    }
}
