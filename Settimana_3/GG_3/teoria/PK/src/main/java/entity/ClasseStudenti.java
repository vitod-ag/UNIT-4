package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classe_studenti")
public class ClasseStudenti {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private int piano;

    public List<Studente> getStudenti() {
        return studenti;
    }

//    essendo il lato non proprietario il settaggio non serve
//    public void setStudenti(List<Studente> studenti) {
//        this.studenti = studenti;
//    }

    //lato non proprietario: ha la List e il mappedBy
    @OneToMany(mappedBy = "classeStudenti")
    private List<Studente> studenti;

    public ClasseStudenti(Integer id, String nome, int piano) {
        this.id = id;
        this.nome = nome;
        this.piano = piano;
    }

    public ClasseStudenti() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }
}
