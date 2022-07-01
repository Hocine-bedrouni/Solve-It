package fr.solveit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "compte")
public class Compte  implements Serializable {
    @Id
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "mdp")
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
