import javax.persistence.*;
import java.util.*;
import java.time.*;

@Entity
public class Client_Securities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Client_ID;
    private int quantity;
    private Long Security_ID;
    private Date purchaseDt;

    // Default constructor required by JPA
    public Client_Securities() {
    }

    // Constructor to initialize all instance variables
    public Client_Securities(int quantity, Date purchaseDt) {
        this.quantity =quantity;
        this.purchaseDt = purchaseDt;
        
    }

    // Getter and Setter for advisorId (no setter for id field is required)
    public Long getClient_ID() {
        return Client_ID;
    }
    public Long getSecurity_ID() {
        return Security_ID;
    }
    // Getters and Setters for other instance variables
    public int quantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity= quantity;
    }

    public Date purchaseDt() {
        return purchaseDt;
    }

    public void setpurchaseDt(Date purchaseDt) {
        this.purchaseDt = purchaseDt;
    }

    }