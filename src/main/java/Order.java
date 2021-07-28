import java.time.LocalDateTime;
public class Order {
    private Long id;
    private LocalDateTime creationdate;

    public Long getId() {
        return id;
    }

    public Order() {
    }

    public Order(Long id, LocalDateTime creationdate) {
        this.id = id;
        this.creationdate = creationdate;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getCreationdate(){
        return  creationdate;
    }
    public  void  setCreationdate(LocalDateTime creationdate){
        this.creationdate =creationdate;
    }
}
