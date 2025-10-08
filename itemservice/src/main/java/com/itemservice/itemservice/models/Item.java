
package com.itemservice.itemservice.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data   //make setter and getters from lombok
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    @Id
    @GenertedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer quentity;
    private String provider; 
}

