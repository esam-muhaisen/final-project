
import com.orderservice.orderservice.models.Order;
import com.orderservice.orderservice.repositories.OrderRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/orders")

public class OrderController {
    
    @Autowired
    private OrderService orderservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Order>> showAllOrders(){
        List<Order> orders = this.orderservice.getAllOrders();
        return new ResponseEntity(orders, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id){
        Order retrievedorder = this.orderservice.getOrderById(id); 
        return new ResponseEntity<>(retrievedorder, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        Order newOrder = this.orderservice.addOrder(order);
        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
        
    }
}
