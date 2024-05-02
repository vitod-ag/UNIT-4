import dao.StudenteDao;
import entity.Indirizzo;
import entity.Studente;
import entity.TipoStudenti;

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
        s1.setNome("Lino");
        s1.setCognome("Marini");
        s1.setTipoStudenti(TipoStudenti.LAVORATORE);
        s1.setDataNascita(LocalDate.of(2000,8,6));

        // creo un oggetto indirizzo
        Indirizzo indirizzo = new Indirizzo();
        indirizzo.setVia("Via Roma 2");
        indirizzo.setComune("Napoli");
        indirizzo.setProvincia("NA");
        // setto l'indirizzo allo studente a cui si riferisce
        s1.setIndirizzo(indirizzo);
        dao.save(s1);



//
//        s1.setNome("Nino");
//        s1.setCognome("Salvini");
//        s1.setIndirizzo("Via dei Tali, 11");
//        s1.setDataNascita(LocalDate.of(2000,12,11));
//        //dao.save(s1);
//
//
//        Studente s2 = dao.getById(1);
//        System.out.println(s2);
//
//        s2.setIndirizzo("Piazza Roma, 54");
//        //dao.save(s2);
//
//        dao.delete(s2);

    }
}
