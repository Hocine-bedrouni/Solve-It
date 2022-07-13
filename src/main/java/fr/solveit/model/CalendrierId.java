package fr.solveit.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CalendrierId implements Serializable {
    private static final long serialVersionUID = -7657830460147523710L;
    @ManyToOne
    @JoinColumn(name="Session_id")
    private Session Session;
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

    public CalendrierId(Session Session, Session session, Formateur formateur, FeuilleEmargement feuilleEmargement, Administration auteur) {
        this.Session = Session;
        this.session = session;
        this.formateur = formateur;
        this.feuilleEmargement = feuilleEmargement;
        this.auteur = auteur;
    }

    public Session getSession() {
        return Session;
    }

    public void setSession(Session Session) {
        this.Session = Session;
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
                "Session=" + Session +
                ", session=" + session +
                ", formateur=" + formateur +
                ", feuilleEmargement=" + feuilleEmargement +
                ", auteur=" + auteur +
                '}';
    }
}
