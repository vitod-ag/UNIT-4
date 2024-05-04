package next_devs.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "cataloghi")
public class Catalogo {
    @Id
    private String codiceISBN;
    private String titolo;
    @Column(name = "anno_pubblicazione")
    private Integer annoPubblicazione;
    private Integer numeroPagine;


    public Catalogo(String codiceISBN,String titolo, Integer annoPubblicazione, Integer numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public Catalogo() {}

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogo catalogo = (Catalogo) o;
        return Objects.equals(codiceISBN, catalogo.codiceISBN) && Objects.equals(titolo, catalogo.titolo) && Objects.equals(annoPubblicazione, catalogo.annoPubblicazione) && Objects.equals(numeroPagine, catalogo.numeroPagine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceISBN, titolo, annoPubblicazione, numeroPagine);
    }


}
