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
        this.numSecu = num_secu;
        this.status = status;
    }

    public String getNum_secu() {
        return numSecu;
    }

    public void setNum_secu(String num_secu) {
        this.numSecu = num_secu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
