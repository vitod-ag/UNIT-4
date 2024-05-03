package next_devs.evento;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Concerto extends Evento{

    @Enumerated(EnumType.STRING)
    private Genere genere;

    private boolean inStreaming;

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, Integer numeroMassimoPartecipanti, Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto(Genere genere, boolean inStreaming) {
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto () {}

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}
