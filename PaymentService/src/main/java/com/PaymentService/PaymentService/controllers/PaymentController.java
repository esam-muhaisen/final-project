
import com.paymentservice.paymentservice.models.Payment;
import com.paymentservice.paymentservice.repositories.PaymentRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/Payment")

public class PaymentController {
    
    @Autowired
    private PaymentService paymentservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Payment>> showAllPayments(){
        List<Payment> payments = this.paymentservice.getAllPayments();
        return new ResponseEntity(payments, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id){
        Order retrievedPayment = this.paymentservice.getPaymentById(id); 
        return new ResponseEntity<>(retrievedPayment, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Payment> addPayment(@RequestBody Payment payment){
        Payment newPayment = this.paymentservice.addPayment(Payment);
        return new ResponseEntity<>(newPayment, HttpStatus.CREATED);
        
    }
}
