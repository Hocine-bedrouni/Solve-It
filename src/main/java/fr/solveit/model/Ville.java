package fr.solveit.model;

public class Ville {
    private int id;
    private String libelle;
    private Departement departement;

    public Ville() {
    }

    public Ville(int id, String libelle, Departement departement) {
        this.id = id;
        this.libelle = libelle;
        this.departement = departement;
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

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
