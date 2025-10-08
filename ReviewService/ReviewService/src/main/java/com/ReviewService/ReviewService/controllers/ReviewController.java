
import com.reviewservice.reviewservice.models.Review;
import com.reviewservice.reviewservice.repositories.ReviewRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/Review")

public class ReviewController {
    
    @Autowired
    private ReviewService reviewservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Review>> showAllReviews(){
        List<Review> reviews = this.reviewservice.getAllReviews();
        return new ResponseEntity(reviews, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long id){
        Review retrievedReview = this.reviewservice.getReviewById(id); 
        return new ResponseEntity<>(retrievedReview, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Review> addReview(@RequestBody Review review){
        Review newReview = this.reviewservice.addReview(review);
        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
        
    }
}
