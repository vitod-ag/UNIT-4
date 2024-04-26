import java.time.LocalDate;

public class Rivista extends Catalogo {

    private Periodicita periodicita;

    public Rivista(String codiceISBN,String titolo, LocalDate annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
        super(codiceISBN,titolo,annoPubblicazione,numeroPagine);
        this.periodicita = periodicita;
    }


    public Periodicita getPeriodicita() {
        return this.periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", numeroPagine=" + getNumeroPagine() +
                ", periodicita=" + periodicita +
                '}';
    }
}
