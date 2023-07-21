import javax.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    private String name;
    private String address;
    private String email;

    // Default constructor required by JPA
    public FinancialAdvisor() {
    }

    // Constructor to initialize all instance variables
    public FinancialAdvisor(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    // Getter and Setter for advisorId (no setter for id field is required)
    public Long getAdvisorId() {
        return advisorId;
    }

    // Getters and Setters for other instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
