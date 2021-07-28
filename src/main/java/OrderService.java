import java.time.LocalDateTime;

public class OrderService {
    private final OrderRepository orderRepository;

    public  OrderService(OrderRepository orderRepository){

        this.orderRepository = orderRepository;
    }
    // to create new orders
    public  Order create(Order order){

        order.setCreationdate(LocalDateTime.now());
        return orderRepository.save(order);
    }
    //getorderbyid
    public  Order GetOrder(Long id){
        return orderRepository.FindOrderByid(id);

    }

}