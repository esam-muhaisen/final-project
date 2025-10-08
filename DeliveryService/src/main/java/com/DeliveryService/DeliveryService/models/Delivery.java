
package com.deliveryservice.deliveryservice.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data  
@NoArgsConstructor
@AllArgsConstructor

public class Delivery {
    @Id
    @GenertedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private String status;
    private String name;
}

