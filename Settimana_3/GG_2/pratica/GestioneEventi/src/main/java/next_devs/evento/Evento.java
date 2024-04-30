package next_devs.evento;


import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
//    METODI per l'auto-incremento dell'ID:

//    1.@GeneratedValue
//    2.@GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    3.@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eventi_id_sequence")
//     @SequenceGenerator(name = "eventi_id_sequence", initialValue = 1, allocationSize = 1)
//
//    occhio che qui si inizia da 0!
//    4.@GeneratedValue(strategy = GenerationType.TABLE, generator = "eventi_id_table")
//     @TableGenerator(name = "eventi_id_table", initialValue = 0, allocationSize = 1)



    private Integer id;

    @Column(nullable = false,length = 30)
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate dataEvento;

    @Column(length = 50)
    private String descrizione;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private Integer numeroMassimoPartecipanti;

    public Evento(Integer id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, Integer numeroMassimoPartecipanti) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Evento() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
