package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClasseStudenti {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
}
