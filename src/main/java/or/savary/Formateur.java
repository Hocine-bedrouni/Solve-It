package or.savary;

import java.sql.Date;

public class Formateur extends Utilisateur{
    private String numSecu;
    private Matiere matiere;

    public Formateur() {
        super();
    }

    public Formateur(String numSecu, String nom, String prenom, Date dateNaissance, String adresse, String civilite, Compte compte, Ville villeHabitation, Ville naissance, String numSecu1, Matiere matiere) {
        super(numSecu, nom, prenom, dateNaissance, adresse, civilite, compte, villeHabitation, naissance);
        this.numSecu = numSecu1;
        this.matiere = matiere;
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

    @Override
    public String toString() {
        return "Formateur{" +
                "num_secu='" + numSecu + '\'' +
                ", matiere=" + matiere +
                '}'+ super.toString();
    }

}
