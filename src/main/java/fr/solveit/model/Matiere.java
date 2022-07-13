package fr.solveit.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "libelle")
    private String libelle;

    @OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
    List<Formateur> formateurs=new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    List<Calendrier> calendriers=new ArrayList<>();

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
