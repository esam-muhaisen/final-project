
package com.deliveryservice.deliveryservice.services;

import com.deliveryservice.deliveryservice.models.Delivery;
import com.deliveryservice.deliveryservice.repositories.DeliveryRepository;
import java.util.List;

@Service
public class DeliveryService {
    
    @Autowired
    private DeliveryRepository deliveryRepository;
    
    public List<Delivery> getAllDeliver(){
        return this.deliveryRepository.findAll();
    }
    
    public Delivery getDeliveryById(Long id){
        return this.deliveryRepository.findById(id).get();
    }
    
    public Delivery addDelivery(Delivery delivery){
        return this.deliveryRepository.save(delivery);
    }
    
    
    
}
