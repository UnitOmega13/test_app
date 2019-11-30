package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StockModel {

    @Id
    private Long stockID;
    private String comment;
    private int edrpou;
    private int amount;
    private int authorizedCapital;
    private double fullNominalCost;
    private double nominalCost;
    private double dutyPaid;
    private Date prodactionDate;

    public long getStockID() {
        return stockID;
    }

    public void setStockID(long stockID) {
        this.stockID = stockID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getEdrpou() {
        return edrpou;
    }

    public void setEdrpou(int edrpou) {
        this.edrpou = edrpou;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAuthorizedCapital() {
        return authorizedCapital;
    }

    public void setAuthorizedCapital(int authorizedCapital) {
        this.authorizedCapital = authorizedCapital;
    }

    public double getFullNominalCost() {
        return fullNominalCost;
    }

    public void setFullNominalCost(double fullNominalCost) {
        this.fullNominalCost = fullNominalCost;
    }

    public double getNominalCost() {
        return nominalCost;
    }

    public void setNominalCost(double nominalCost) {
        this.nominalCost = nominalCost;
    }

    public double getDutyPaid() {
        return dutyPaid;
    }

    public void setDutyPaid(double dutyPaid) {
        this.dutyPaid = dutyPaid;
    }

    public Date getProdactionDate() {
        return prodactionDate;
    }

    public void setProdactionDate(Date prodactionDate) {
        this.prodactionDate = prodactionDate;
    }
}
