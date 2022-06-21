package fr.solveit.model;

public class Absence {
    private FeuilleEmargement feuilleEmargement;
    private Stagiaire stagiaire;
    private Session session;
    private boolean absent;
    private boolean absenceJustifie;

    public Absence() {
    }

    public Absence(FeuilleEmargement feuilleEmargement, Stagiaire stagiaire, Session session, boolean absent, boolean absenceJustifie) {
        this.feuilleEmargement = feuilleEmargement;
        this.stagiaire = stagiaire;
        this.session = session;
        this.absent = absent;
        this.absenceJustifie = absenceJustifie;
    }

    public FeuilleEmargement getFeuilleEmergement() {
        return feuilleEmargement;
    }

    public void setFeuilleEmergement(FeuilleEmargement feuilleEmargement) {
        this.feuilleEmargement = feuilleEmargement;
    }

    public Stagiaire getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Stagiaire stagiaire) {
        this.stagiaire = stagiaire;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean isAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }

    public boolean isAbsenceJustifie() {
        return absenceJustifie;
    }

    public void setAbsenceJustifie(boolean absenceJustifie) {
        this.absenceJustifie = absenceJustifie;
    }

    @Override
    public String toString() {
        return "Absence{" +
                "feuilleEmergement=" + feuilleEmargement +
                ", stagiaire=" + stagiaire +
                ", session=" + session +
                ", absent=" + absent +
                ", absenceJustifie=" + absenceJustifie +
                '}';
    }
}
