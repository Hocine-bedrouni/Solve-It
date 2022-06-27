package fr.solveit.model;

import javax.persistence.*;

@Entity
@Table(name="Matiere")
public class Matiere {

    @Id
    private int id;
    @Column(name = "libelle")
    private String libelle;

    public Matiere() {
    }

    public Matiere(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
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

    @Override
    public String toString() {
        return "Matiere{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
