package fr.solveit.model;

import javax.persistence.*;

import java.sql.Date;
@Entity
@Table(name="Formateur")
public class Formateur extends Utilisateur {
    @Id
    @Column(name="num_secu")
    private String numSecu;
    @ManyToOne
    @JoinColumn (name="Matiere_id")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn (name="Matiere_session_id")
    private Session session;

    public Formateur() {
        super();
    }

    public Formateur(String numSecu, String nom, String prenom, Date dateNaissance, String adresse, String civilite, Compte compte, Ville villeHabitation, Ville naissance,  Matiere matiere,Session session) {
        super(numSecu, nom, prenom, dateNaissance, adresse, civilite, compte, villeHabitation, naissance);
        this.numSecu = numSecu;
        this.matiere = matiere;
        this.session=session;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "num_secu='" + numSecu + '\'' +
                "matiere='" + matiere + '\'' +
                ", session=" + session +
                '}'+ super.toString();
    }

}
