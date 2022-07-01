package fr.solveit.model;

import javax.persistence.*;

@Entity
@Table(name = "situationProrfessionnelle")
public class SituationProrfessionnelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column

    private boolean salarie;
    @Column

    private boolean demandeur_emploi;
    @Column

    private boolean inscription_pole_emploi;

    public SituationProrfessionnelle() {
    }

    public SituationProrfessionnelle(int id, boolean salarie, boolean demandeur_emploi, boolean inscription_pole_emploi) {
        this.id = id;
        this.salarie = salarie;
        this.demandeur_emploi = demandeur_emploi;
        this.inscription_pole_emploi = inscription_pole_emploi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSalarie() {
        return salarie;
    }

    public void setSalarie(boolean salarie) {
        this.salarie = salarie;
    }

    public boolean isDemandeur_emploi() {
        return demandeur_emploi;
    }

    public void setDemandeur_emploi(boolean demandeur_emploi) {
        this.demandeur_emploi = demandeur_emploi;
    }

    public boolean isInscription_pole_emploi() {
        return inscription_pole_emploi;
    }

    public void setInscription_pole_emploi(boolean inscription_pole_emploi) {
        this.inscription_pole_emploi = inscription_pole_emploi;
    }

    @Override
    public String toString() {
        return "SituationProrfessionnelle{" +
                "id=" + id +
                ", salarie=" + salarie +
                ", demandeur_emploi=" + demandeur_emploi +
                ", inscription_pole_emploi=" + inscription_pole_emploi +
                '}';
    }
}
