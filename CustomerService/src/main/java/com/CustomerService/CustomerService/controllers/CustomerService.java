import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Customer")

public class CustomerController {
    
    @Autowired
    private CustomerService customerservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Customer>> showAllCustomers(){
        List<Customer> Customers = this.CustomerService.getAllCustomers();
        return new ResponseEntity(Customers, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
        Customer retrievedCustomer = this.CustomerService.getCustomerById(id); 
        return new ResponseEntity<>(retrievedCustomer, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer newCustomer = this.CustomerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        
    }
}
