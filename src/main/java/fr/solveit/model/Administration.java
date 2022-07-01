package fr.solveit.model;

import javax.persistence.*;

@Entity
@Table(name = "administration")

public class Administration {
    @Id
    private String numSecu;
    @Column
    private String  status;

    public Administration() {
    }

    public Administration(String num_secu, String status) {
        this.num_secu = num_secu;
        this.status = status;
    }

    public String getNum_secu() {
        return num_secu;
    }

    public void setNum_secu(String num_secu) {
        this.num_secu = num_secu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
