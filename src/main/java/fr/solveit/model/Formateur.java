package fr.solveit.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Formateur")
@DiscriminatorValue(value = "f")
public class Formateur extends Utilisateur implements Serializable {

    @ManyToOne
    @JoinColumn (name="Session_id")
    private Session Session;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Calendrier> calendriers = new ArrayList<Calendrier>();


    public Formateur() {
        super();
    }

    public Formateur(String numSecu, String nom, String prenom, Date dateNaissance, String adresse, String civilite, Compte compte, Ville villeHabitation, Ville naissance,  Session Session) {
        super(numSecu, nom, prenom, dateNaissance, adresse, civilite, compte, villeHabitation, naissance);
        super.setNumSecu(numSecu);
        this.Session = Session;
    }

    public String getNumSecu() {
        return super.getNumSecu();
    }

    public void setNumSecu(String numSecu) {
        super.setNumSecu(numSecu);
    }

    public Session getSession() {
        return Session;
    }

    public void setSession(Session Session) {
        this.Session = Session;
    }



    @Override
    public String toString() {
        return "Formateur{" +
                "num_secu='" + super.getNumSecu() + '\'' +
                "Session='" + Session + '\'' +
                '}'+ super.toString();
    }

}
