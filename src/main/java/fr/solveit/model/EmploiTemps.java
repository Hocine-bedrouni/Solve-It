package fr.solveit.model;

import java.io.Serializable;
import java.sql.Date;

public class EmploiTemps  implements Serializable {
    private int id;
    private Administration auteur;
    private Session session;
    private String libelle;
    private Date date_debut_semaine;
    private Date date_fin_semaine;
    private Date date_edition;

    public EmploiTemps() {
    }

    public EmploiTemps(int id, Administration auteur, Session session, String libelle, Date date_debut_semaine, Date date_fin_semaine, Date date_edition) {
        this.id = id;
        this.auteur = auteur;
        this.session = session;
        this.libelle = libelle;
        this.date_debut_semaine = date_debut_semaine;
        this.date_fin_semaine = date_fin_semaine;
        this.date_edition = date_edition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administration getAuteur() {
        return auteur;
    }

    public void setAuteur(Administration auteur) {
        this.auteur = auteur;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDate_debut_semaine() {
        return date_debut_semaine;
    }

    public void setDate_debut_semaine(Date date_debut_semaine) {
        this.date_debut_semaine = date_debut_semaine;
    }

    public Date getDate_fin_semaine() {
        return date_fin_semaine;
    }

    public void setDate_fin_semaine(Date date_fin_semaine) {
        this.date_fin_semaine = date_fin_semaine;
    }

    public Date getDate_edition() {
        return date_edition;
    }

    public void setDate_edition(Date date_edition) {
        this.date_edition = date_edition;
    }

    @Override
    public String toString() {
        return "EmploiTemps{" +
                "id=" + id +
                ", administration=" + auteur +
                ", session=" + session +
                ", libelle='" + libelle + '\'' +
                ", date_debut_semaine=" + date_debut_semaine +
                ", date_fin_semaine=" + date_fin_semaine +
                ", date_edition=" + date_edition +
                '}';
    }
}
