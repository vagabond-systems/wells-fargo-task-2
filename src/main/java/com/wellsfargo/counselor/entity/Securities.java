import javax.persistence.*;

@Entity
public class Secuirties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Security_ID;
    private Long Price;
    private String Sec_name;
    private String Category;
   

    // Default constructor required by JPA
    public Secuirties() {
    }

    // Constructor to initialize all instance variables
    public Secuirties(String Sec_name, String Category, Long Price) {
        this.Sec_name = Sec_name;
        this.Category = Category;
        this.Price = Price;
    }

    // Getter and Setter for advisorId (no setter for id field is required)
    public Long getSecurity_ID() {
        return Security_ID;
    }

    // Getters and Setters for other instance variables
    public String getSec_name() {
        return Sec_name;
    }

    public void setSec_name(String Sec_name) {
        this.Sec_name = Sec_name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Long Price() {
        return  Price;
    }

    public void setEmail(Long Price) {
        this.Price =  Price;
    }
}