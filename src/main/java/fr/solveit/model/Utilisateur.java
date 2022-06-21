package fr.solveit.model;

import java.sql.Date;

public class Utilisateur {
    /**
     *  numéro de sécurité social
     */
    private String numSecu;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String civilite;
    private Compte compte;
    private Ville villeHabitation;
    private Ville villeNaissance;

    public Utilisateur() {
    }

    public Utilisateur(String numSecu, String nom, String prenom, Date dateNaissance, String adresse, String civilite, Compte compte, Ville villeHabitation, Ville villeNaissance) {
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.civilite = civilite;
        this.compte = compte;
        this.villeHabitation = villeHabitation;
        this.villeNaissance = villeNaissance;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Ville getVilleHabitation() {
        return villeHabitation;
    }

    public void setVilleHabitation(Ville villeHabitation) {
        this.villeHabitation = villeHabitation;
    }

    public Ville getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(Ville villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "numSecu='" + numSecu + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse='" + adresse + '\'' +
                ", civilite='" + civilite + '\'' +
                ", compte=" + compte +
                ", villeHabitation=" + villeHabitation +
                ", naissance=" + villeNaissance +
                '}';
    }



}
