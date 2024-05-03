package next_devs.evento;

import javax.persistence.*;

@Entity
@Table(name = "partecipazioni")
// il = :evento sta a significare che è un evento che valorizzero dopo
@NamedQuery(name = "getPersonaByEvento",query = "SELECT part.persona FROM Partecipazione part WHERE part.evento= :evento")
public class Partecipazione {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione(Persona persona, Stato stato, Evento evento) {
        this.persona = persona;
        this.stato = stato;
        this.evento = evento;
    }

    public Partecipazione() {}

    public Integer getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
