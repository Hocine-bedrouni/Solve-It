package fr.solveit.model;
import javax.persistence.*;


@Entity
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String libelle ;
    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;

    public Session() {
    }

    public Session(int id, String libelle, Date date_debut, Date date_fin) {
        this.id = id;
        this.libelle = libelle;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
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

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
}
