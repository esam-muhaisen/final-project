import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/delivery")

public class DeliveryController {
    
    @Autowired
    private DeliveryService deliveryservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Delivery>> showAllDelivery(){
        List<Delivery> delivery = this.deliveryservice.getAllDeliver();
        return new ResponseEntity(delivery, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable Long id){
        Delivery retrieveddelivery = this.deliveryservice.getDeliveryById(id); 
        return new ResponseEntity<>(retrieveddelivery, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Delivery> addDelivery(@RequestBody Delivery delivery){
        Delivery newDelivery = this.deliveryservice.addDelivery(delivery);
        return new ResponseEntity<>(newDelivery, HttpStatus.CREATED);
        
    }
}
