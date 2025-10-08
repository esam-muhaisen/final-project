
package com.customerservice.customerservice.models;
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

public class Customer {
    @Id
    @GenertedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String passwrod;
}

