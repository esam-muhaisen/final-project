
package com.orderservice.orderservice.models;
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

public class Order {
    @Id
    @GenertedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long customerId;
    private Long menuItemId;
    private String status;
}

