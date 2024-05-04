package next_devs.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utenti")
public class Utente {
    @Id
    @Column(name = "numero_di_tessera")
    @GeneratedValue
    private Integer numeroDiTessera;
    @Column(length = 50)
    private String nome;
    @Column(length = 50)
    private String cognome;
    @Column(name = "data_di_nascita")
    private LocalDate dataNascita;
    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti;

    public Utente(String nome, String cognome, LocalDate dataNascita, Integer numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroDiTessera = numeroDiTessera;
        this.prestiti = new ArrayList<>();
    }

    public Utente() {
        this.prestiti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(Integer numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "numeroDiTessera=" + numeroDiTessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", prestiti=" + prestiti +
                '}';
    }
}
