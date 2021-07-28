import java.time.LocalDateTime;
// to create new orders
public class OrderService {
    private final OrderRepository orderRepository;
    public  OrderService(OrderRepository orderRepository){

        this.orderRepository = orderRepository;
    }
    public  Order create(Order order){

        order.setCreationdate(LocalDateTime.now());
        return orderRepository.save(order);
    }
    public  Order GetOrder(Long id){
        return orderRepository.FindOrderByid(id);

    }

}