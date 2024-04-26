import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Catalogo {
    private HashSet<String> codiceISBN;
    private String titolo;
    private LocalDate annoPubblicazione;
    private Integer numeroPagine;


    public Catalogo(String codiceISBN,String titolo, LocalDate annoPubblicazione, Integer numeroPagine) {
        this.codiceISBN = new HashSet<>();
        this.codiceISBN.add(codiceISBN);
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public HashSet<String> getCodiceISBN() {
        return codiceISBN;
    }

    //non faccio il set del codice ISBN visto che non va settato

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
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
