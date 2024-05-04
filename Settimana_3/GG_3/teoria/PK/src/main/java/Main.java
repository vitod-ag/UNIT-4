import dao.ClasseStudentiDao;
import dao.CorsoDao;
import dao.IndirizzoDao;
import dao.StudenteDao;
import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("epicode_jpa");
        EntityManager em = emf.createEntityManager();

        StudenteDao dao = new StudenteDao(em);
        // se non creo il DAO anche dell'indirizzo, non viene considerato essendo una nuova classe/entità
        IndirizzoDao indirizzoDao = new IndirizzoDao(em);
        ClasseStudentiDao classeStudentiDao = new ClasseStudentiDao(em);
        CorsoDao corsoDao = new CorsoDao(em);
//
//
//        Studente s1 = new Studente();
//        s1.setNome("Lino");
//        s1.setCognome("Marini");
//        s1.setTipoStudenti(TipoStudenti.LAVORATORE);
//        s1.setDataNascita(LocalDate.of(2000,8,6));
//
//        // creo un oggetto indirizzo
//        Indirizzo indirizzo = new Indirizzo();
//        indirizzo.setVia("Via Roma 2");
//        indirizzo.setComune("Napoli");
//        indirizzo.setProvincia("NA");
//        // prima di settare l'indirizzo, salvo l'indirizzo dao
//        indirizzoDao.save(indirizzo);
//        // setto l'indirizzo allo studente a cui si riferisce
//        s1.setIndirizzo(indirizzo);
//        // ora possiamo salvare lo studente
//        dao.save(s1);
//
//        em.refresh(indirizzo);  // refresho per farmi stampre lo studente dall'indirizzo sotto
//
//
//        System.out.println(indirizzo.getStudente());// così mi dà null. Questa cosa ci viene fatta gratis da JPA
//
//        ClasseStudenti classeStudenti = new ClasseStudenti();
//        classeStudenti.setNome("1L");
//        classeStudenti.setPiano(2);
//        classeStudentiDao.save(classeStudenti);
//
//        Studente s2 = new Studente();
//        s2.setTipoStudenti(TipoStudenti.FULL_TIME);
//        s2.setNome("Giacomo");
//        s2.setCognome("Lol");
//        s2.setDataNascita(LocalDate.of(1997,3,19));
//        s2.setClasseStudenti(classeStudenti);
//        dao.save(s2);

        // studente senza classe a cui li assegno una classe gia presente
//            Studente s3 = dao.getById(13);
//
//            ClasseStudenti classeStudenti2 = classeStudentiDao.getById(14);
//
//            s3.setClasseStudenti(classeStudenti2);
//
//            dao.save(s3);


        // assegno una nuova classe ad uno studente che ha gia una classe ma li assegno una classe non ancora creata
//            ClasseStudenti classeStudenti = new ClasseStudenti();
//            classeStudenti.setNome("2M");
//            classeStudenti.setPiano(2);
//            classeStudentiDao.save(classeStudenti);
//
//            Studente studente = dao.getById(13);
//            studente.setClasseStudenti(classeStudenti);
//            dao.save(studente);

        // --voglio recuperare tutti gli studenti di una classe creati da database
//             ClasseStudenti classeStudenti = classeStudentiDao.getById(14);
//             classeStudenti.getStudenti().forEach(System.out::println);


        //creo i corsi e li assegno agli studenti che già ho
        Corso corso1 = new Corso();
        corso1.setNome("matematica");
        corsoDao.save(corso1);

        Corso corso2 = new Corso();
        corso2.setNome("storia");
        corsoDao.save(corso2);

        // recupero gli studenti che già ho
        Studente s1 =  dao.getById(1);
        Studente s2 =  dao.getById(2);
        Studente s3 =  dao.getById(13);
        Studente s4 =  dao.getById(15);

        s1.setCorsi(List.of(corso1,corso2));
        s2.setCorsi(List.of(corso1,corso2));
        s3.setCorsi(List.of(corso1,corso2));
        s4.setCorsi(List.of(corso1,corso2));

        dao.save(s1);
        dao.save(s2);
        dao.save(s3);
        dao.save(s4);


    }
}
