package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter @AllArgsConstructor
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

    public Stock(){}

}
