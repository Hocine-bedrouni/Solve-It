package fr.solveit.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CalendrierId implements Serializable {
    private static final long serialVersionUID = -7657830460147523710L;
    @ManyToOne
    @JoinColumn(name="matiere_id")
    private Matiere matiere;
    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;
    @ManyToOne
    @JoinColumn(name = "formateur_num_secu")
    private Formateur formateur;
    @ManyToOne
    @JoinColumn(name="FeuilleEmargement_num")
    private FeuilleEmargement feuilleEmargement;

    @ManyToOne
    @JoinColumn(name = "administration_num_secu")
    private Administration auteur;

    public CalendrierId() {
    }

    public CalendrierId(Matiere matiere, Session session, Formateur formateur, FeuilleEmargement feuilleEmargement, Administration auteur) {
        this.matiere = matiere;
        this.session = session;
        this.formateur = formateur;
        this.feuilleEmargement = feuilleEmargement;
        this.auteur = auteur;
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

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public FeuilleEmargement getFeuilleEmargement() {
        return feuilleEmargement;
    }

    public void setFeuilleEmargement(FeuilleEmargement feuilleEmargement) {
        this.feuilleEmargement = feuilleEmargement;
    }

    public Administration getAuteur() {
        return auteur;
    }

    public void setAuteur(Administration auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "CalendrierId{" +
                "matiere=" + matiere +
                ", session=" + session +
                ", formateur=" + formateur +
                ", feuilleEmargement=" + feuilleEmargement +
                ", auteur=" + auteur +
                '}';
    }
}
