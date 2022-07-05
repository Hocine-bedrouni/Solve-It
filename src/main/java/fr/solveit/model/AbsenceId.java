package fr.solveit.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Embeddable
public class AbsenceId implements Serializable {

    @ManyToOne
    @JoinColumn(name="FeuilleEmargement_num")
    private FeuilleEmargement feuilleEmargement;
    @ManyToOne
    @JoinColumn(name = "stagiaire_num_secu")
    private Stagiaire stagiaire;

    public AbsenceId() {
    }

    public AbsenceId(FeuilleEmargement feuilleEmargement, Stagiaire stagiaire) {
        this.feuilleEmargement = feuilleEmargement;
        this.stagiaire = stagiaire;
    }

    public FeuilleEmargement getFeuilleEmargement() {
        return feuilleEmargement;
    }

    public void setFeuilleEmargement(FeuilleEmargement feuilleEmargement) {
        this.feuilleEmargement = feuilleEmargement;
    }

    public Stagiaire getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Stagiaire stagiaire) {
        this.stagiaire = stagiaire;
    }
}
