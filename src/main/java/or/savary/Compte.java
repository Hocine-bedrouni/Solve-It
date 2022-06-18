package or.savary;

import java.util.Objects;

public class Compte {
    private int id;
    private String email;
    private String mdp;

    public Compte() {
    }

    public Compte(int id, String email, String mdp) {
        this.id = id;
        this.email = email;
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                '}';
    }


}
