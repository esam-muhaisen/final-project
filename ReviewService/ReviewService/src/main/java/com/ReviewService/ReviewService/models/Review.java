
package com.reviewservice.reviewservice.models;
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

public class Review {
    @Id
    @GenertedValue(strategy = GenerationType.AUTO)
    
  private Long id;
  private Long orderId;
  private int rating; // 1-5
  private String comment;

}

