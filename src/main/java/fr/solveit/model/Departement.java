package fr.solveit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Departement {
    @Id
    private int id;
    private String libelle;
    private int num_departement;
    private int code_commune;
    @ManyToOne
    private Pays pays;

    public Departement() {
    }

    public Departement(int id, String libelle, int num_departement, int code_commune, Pays pays) {
        this.id = id;
        this.libelle = libelle;
        this.num_departement = num_departement;
        this.code_commune = code_commune;
        this.pays = pays;
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

    public int getNum_departement() {
        return num_departement;
    }

    public void setNum_departement(int num_departement) {
        this.num_departement = num_departement;
    }

    public int getCode_commune() {
        return code_commune;
    }

    public void setCode_commune(int code_commune) {
        this.code_commune = code_commune;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
