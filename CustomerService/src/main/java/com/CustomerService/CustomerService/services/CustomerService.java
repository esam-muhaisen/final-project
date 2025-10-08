
package com.customerservice.customerservice.services;

import com.customerservice.customerservice.models.Customer;
import com.customerservice.customerservice.repositories.CustomerRepository;
import java.util.List;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerrepository;
    
    public List<Customer> getAllCustomers(){
        return this.customerrepository.findAll();
    }
    
    public Customer getCustomerById(Long id){
        return this.customerrepository.findById(id).get();
    }
    
    public Customer addCustomer(Customer customer){
        return this.customerrepository.save(customer);
    }
    
    
    
}
