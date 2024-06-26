package epicode.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "studenti")       // per indicare il nome della tabella, ma anche solo con Entity si crea la tabella
public class Studente {
    @Id
    @GeneratedValue  //gestione automatica degli Id di Hibernate
    private int matricola;

    @Column(nullable = false, length = 30)
    private String nome;

    @Column(nullable = false, length = 30)
    private String cognome;

    private String indirizzo;

    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_studente")
    private TipoStudenti tipoStudenti;


    public Studente(int matricola, String nome, String cognome, String indirizzo, LocalDate dataNascita) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.dataNascita = dataNascita;
    }

    public Studente() {}    // il costruttore vuoto ci serve per creare uno studente vuoto prima, e poi i dati sono inseriti da dopo

    public int getMatricola() {
        return this.matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", dataNascita=" + dataNascita +
                '}';
    }
}
