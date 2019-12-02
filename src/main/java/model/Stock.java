package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long stockID;
    private String comment;
    private int edrpou;
    private int amount;
    private int authorizedCapital;
    private double fullNominalCost;
    private double nominalCost;
    private double dutyPaid;
    private Date prodactionDate;

    public String getComment() {
        return comment;
    }
}
