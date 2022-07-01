package fr.solveit.model;

import javax.persistence.*;

@Entity
@Table(name="pays")
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column

    private String libelle;
    @Column
    private String abv;

    public Pays() {
    }

    public Pays(int id, String libelle, String abv) {
        this.id = id;
        this.libelle = libelle;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }
}
