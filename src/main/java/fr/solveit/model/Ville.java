package fr.solveit.model;

import javax.persistence.*;


@Entity
@Table(name = "ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    @ManyToOne
    @JoinColumn(name = "libelle_ID")
    private String libelle;
    @ManyToOne
    private Departement departement;

    public Ville() {
    }

    public Ville(int id, String libelle, Departement departement) {
        this.id = id;
        this.libelle = libelle;
        this.departement = departement;
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

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
