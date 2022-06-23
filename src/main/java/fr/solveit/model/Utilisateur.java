package fr.solveit.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
public class Utilisateur  implements Serializable {
    /**
     *  numéro de sécurité social
     */
    @Id
    @Column(name="num_secu")
    private String numSecu;
    @Column(name="Nom")

    private String nom;
    @Column(name="Prenom")

    private String prenom;
    @Column(name="date_naissance")

    private Date dateNaissance;
    @Column(name="adresse")

    private String adresse;
    @Column(name="civilite")

    private String civilite;
    @ManyToOne
    @JoinColumn(name="Compte_id")
    private Compte compte;
    @ManyToOne
    @JoinColumn(name="habitation_ville_id")
    @JoinColumn(name="habitation_departement_id",referencedColumnName="departement_id")
    @JoinColumn(name="habitation_pays_id",referencedColumnName="departement_pays_id")
    private Ville villeHabitation;
    @ManyToOne
    @JoinColumn(name="naissance_ville_id")
    @JoinColumn(name="naissance_departement_id",referencedColumnName="departement_id")
    @JoinColumn(name="naissance_pays_id",referencedColumnName="departement_pays_id")
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
