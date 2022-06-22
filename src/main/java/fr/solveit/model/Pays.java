package fr.solveit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pays {
    @Id
    private int id;
    private String libelle;
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
