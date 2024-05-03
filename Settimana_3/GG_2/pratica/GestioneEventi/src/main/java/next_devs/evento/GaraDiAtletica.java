package next_devs.evento;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Evento{

    @ManyToMany(mappedBy = "gareDiAtletica")
    private Set<Persona> atleti;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, Integer numeroMassimoPartecipanti, Set<Persona> atleti, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica() {}

    @ManyToOne
    @JoinColumn(name = "vincitore_id")
    private Persona vincitore;
}
