package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorID;
    
    private String name;
    
    public FinancialAdvisor() {
    }
    
    public FinancialAdvisor(String name) {
        this.name = name;
    }
    
    // Getter and setter for advisorID
    
    public Long getAdvisorID() {
        return advisorID;
    }

    // Getter and setter for name
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
