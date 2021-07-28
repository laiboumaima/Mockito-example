
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.junit.Assert.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class OrderServiceTest {

//manual initialization
 // to mock
    private OrderRepository orderRepository;
    //class undertest
    @InjectMocks
    private OrderService orderService;
    @BeforeEach
    void initService(){
        orderRepository = mock(OrderRepository.class);
        orderService=new OrderService(orderRepository);
    }
    @Test
    void  GetbyId(){
        Order order =new Order(1l, LocalDateTime.of(2021, 2, 13, 15, 56)  );
       when(orderRepository.FindOrderByid(1L)).thenReturn(order);
        Order ordergetted = orderService.GetOrder(1L);

             assertEquals(ordergetted,order);
        verify(orderRepository).FindOrderByid(1L);

    }

    @Test
    void createOrder(){
        Order order =new Order();
        when(orderRepository.save(any(Order.class))).then(returnsFirstArg());
        Order saveOrder= orderService.create(order);
        //methods checks that the object is null or not
        assertNotNull(saveOrder.getCreationdate());
    }


}