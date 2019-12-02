package max.hruslov.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "STOCKS")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
