package or.savary;

import java.sql.Blob;
import java.util.List;

public class Stagiaire {

    private String  numSecu;

    private String diplome;

    private List<String> niveau_entree;

    private boolean difficulte;

    private boolean handicape;

    private boolean domtom;

    private String situation;

    private int nbr_travailleur;

    private boolean enfant;

    private String logement;

    private String parent_francais;

    private boolean rique_perte_logement;

    private String origine_formation;

    private String transport;

    private String allocation;

    private Session session;

    private Hebergement hebergement;

    private SituationProrfessionnelle situationProfessionnelle;

    private Blob signature;

    public Stagiaire() {
    }

    public Stagiaire(String numSecu, String diplome, List<String> niveau_entree, boolean difficulte, boolean handicape, boolean domtom, String situation, int nbr_travailleur, boolean enfant, String logement, String parent_francais, boolean rique_perte_logement, String origine_formation, String transport, String allocation, Session session, Hebergement hebergement, SituationProrfessionnelle situationProfessionnelle, Blob signature) {
        this.numSecu = numSecu;
        this.diplome = diplome;
        this.niveau_entree = niveau_entree;
        this.difficulte = difficulte;
        this.handicape = handicape;
        this.domtom = domtom;
        this.situation = situation;
        this.nbr_travailleur = nbr_travailleur;
        this.enfant = enfant;
        this.logement = logement;
        this.parent_francais = parent_francais;
        this.rique_perte_logement = rique_perte_logement;
        this.origine_formation = origine_formation;
        this.transport = transport;
        this.allocation = allocation;
        this.session = session;
        this.hebergement = hebergement;
        this.situationProfessionnelle = situationProfessionnelle;
        this.signature = signature;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public List<String> getNiveau_entree() {
        return niveau_entree;
    }

    public void setNiveau_entree(List<String> niveau_entree) {
        this.niveau_entree = niveau_entree;
    }

    public boolean isDifficulte() {
        return difficulte;
    }

    public void setDifficulte(boolean difficulte) {
        this.difficulte = difficulte;
    }

    public boolean isHandicape() {
        return handicape;
    }

    public void setHandicape(boolean handicape) {
        this.handicape = handicape;
    }

    public boolean isDomtom() {
        return domtom;
    }

    public void setDomtom(boolean domtom) {
        this.domtom = domtom;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getNbr_travailleur() {
        return nbr_travailleur;
    }

    public void setNbr_travailleur(int nbr_travailleur) {
        this.nbr_travailleur = nbr_travailleur;
    }

    public boolean isEnfant() {
        return enfant;
    }

    public void setEnfant(boolean enfant) {
        this.enfant = enfant;
    }

    public String getLogement() {
        return logement;
    }

    public void setLogement(String logement) {
        this.logement = logement;
    }

    public String getParent_francais() {
        return parent_francais;
    }

    public void setParent_francais(String parent_francais) {
        this.parent_francais = parent_francais;
    }

    public boolean isRique_perte_logement() {
        return rique_perte_logement;
    }

    public void setRique_perte_logement(boolean rique_perte_logement) {
        this.rique_perte_logement = rique_perte_logement;
    }

    public String getOrigine_formation() {
        return origine_formation;
    }

    public void setOrigine_formation(String origine_formation) {
        this.origine_formation = origine_formation;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getAllocation() {
        return allocation;
    }

    public void setAllocation(String allocation) {
        this.allocation = allocation;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Hebergement getHebergement() {
        return hebergement;
    }

    public void setHebergement(Hebergement hebergement) {
        this.hebergement = hebergement;
    }

    public SituationProrfessionnelle getSituationProfessionnelle() {
        return situationProfessionnelle;
    }

    public void setSituationProfessionnelle(SituationProrfessionnelle situationProfessionnelle) {
        this.situationProfessionnelle = situationProfessionnelle;
    }

    public Blob getSignature() {
        return signature;
    }

    public void setSignature(Blob signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "numSecu='" + numSecu + '\'' +
                ", diplome='" + diplome + '\'' +
                ", niveau_entree=" + niveau_entree +
                ", difficulte=" + difficulte +
                ", handicape=" + handicape +
                ", domtom=" + domtom +
                ", situation='" + situation + '\'' +
                ", nbr_travailleur=" + nbr_travailleur +
                ", enfant=" + enfant +
                ", logement='" + logement + '\'' +
                ", parent_francais='" + parent_francais + '\'' +
                ", rique_perte_logement=" + rique_perte_logement +
                ", origine_formation='" + origine_formation + '\'' +
                ", transport='" + transport + '\'' +
                ", allocation='" + allocation + '\'' +
                ", session=" + session +
                ", hebergement=" + hebergement +
                ", situationProfessionnelle=" + situationProfessionnelle +
                ", signature=" + signature +
                '}';
    }
}
