package fr.solveit.model;

import java.sql.Date;
import java.sql.Time;

public class Calendrier {
    private Matiere matiere;
    private Session session;
    private Time heure_debut;
    private Time heure_fin;
    private Date date;
    private Formateur formateur;
    private FeuilleEmargement feuilleEmargement;
    private Administration auteur;

    public Calendrier() {
    }

    public Calendrier(Matiere matiere, Session session, Time heure_debut, Time heure_fin, Date date, Formateur formateur, FeuilleEmargement feuilleEmargement, Administration auteur) {
        this.matiere = matiere;
        this.session = session;
        this.heure_debut = heure_debut;
        this.heure_fin = heure_fin;
        this.date = date;
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

    public Time getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(Time heure_debut) {
        this.heure_debut = heure_debut;
    }

    public Time getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(Time heure_fin) {
        this.heure_fin = heure_fin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return "Calendrier{" +
                "matiere=" + matiere +
                ", session=" + session +
                ", heure_debut=" + heure_debut +
                ", heure_fin=" + heure_fin +
                ", date=" + date +
                ", formateur=" + formateur +
                ", feuilleEmargement=" + feuilleEmargement +
                ", administration=" + auteur +
                '}';
    }
}
