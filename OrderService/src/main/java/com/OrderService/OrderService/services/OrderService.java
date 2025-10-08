
package com.orderservice.orderservice.services;

import com.orderservice.orderservice.models.Order;
import com.orderservice.orderservice.repositories.OrderRepository;
import java.util.List;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderrepository;
    
    public List<Order> getAllOrders(){
        return this.orderrepository.findAll();
    }
    
    public Order getOrderById(Long id){
        return this.orderrepository.findById(id).get();
    }
    
    public Order addOrder(Order order){
        return this.orderrepository.save(order);
    }
}
