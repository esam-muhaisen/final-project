
package com.paymentservice.paymentservice.services;

import com.paymentservice.paymentservice.models.Payment;
import com.paymentservice.paymentservice.repositories.PaymentRepository;
import java.util.List;

@Service
public class PaymentService {
    
    @Autowired
    private PaymentRepository paymentrepository;
    
    public List<Payment> getAllPayments(){
        return this.paymentrepository.findAll();
    }
    
    public Payment getPaymentById(Long id){
        return this.paymentrepository.findById(id).get();
    }
    
    public Payment addPayment(Payment payment){
        return this.paymentrepository.save(payment);
    }
}
