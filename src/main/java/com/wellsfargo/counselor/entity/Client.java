import javax.persistence.*;

@Entity
public class Clients{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Client_ID;
    private String Cl_name;
   private Long advisorId;
   private Long Security_ID;

    // Default constructor required by JPA
    public Clients() {
    }

    // Constructor to initialize all instance variables
    public Clients(String Cl_name) {
        this.Cl_name = Cl_name;

    }

    // Getter and Setter for advisorId (no setter for id field is required)
    public Long getAdvisorId() {
        return advisorId;
    }

    public Long getClient_ID() {
        return Client_ID;
    }
    public Long getSecurity_ID() {
        return Security_ID;
    }
    // Getters and Setters for other instance variables
    public String getCl_name() {
        return Cl_name;
    }

    public void setCl_name(String Cl_name) {
        this.Cl_name = Cl_name;
    }


}
