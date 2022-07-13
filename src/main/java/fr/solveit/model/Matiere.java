package fr.solveit.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "libelle")
    private String libelle;

    @OneToMany(mappedBy = "Session", fetch = FetchType.LAZY)
    List<Formateur> formateurs=new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    List<Calendrier> calendriers=new ArrayList<>();

    public Session() {
    }

    public Session(int id, String libelle) {
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
        return "Session{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
