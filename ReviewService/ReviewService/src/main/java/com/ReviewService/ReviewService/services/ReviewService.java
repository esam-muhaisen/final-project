
package com.reviewservice.reviewservice.services;

import com.reviewservice.reviewservice.models.Review;
import com.reviewservice.reviewservice.repositories.ReviewRepository;
import java.util.List;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewrepository;
    
    public List<Review> getAllReviews(){
        return this.reviewrepository.findAll();
    }
    
    public Review getReviewById(Long id){
        return this.reviewrepository.findById(id).get();
    }
    
    public Review addReview(Review review){
        return this.reviewrepository.save(review);
    }
}
