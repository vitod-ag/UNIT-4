package next_devs.Entity;

import next_devs.Enums.Periodicita;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "riviste")
public class Rivista extends Catalogo {

    private Periodicita periodicita;

    public Rivista(String codiceISBN,String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
        super(codiceISBN,titolo,annoPubblicazione,numeroPagine);
        this.periodicita = periodicita;
    }

    public Rivista(){
        super();
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
