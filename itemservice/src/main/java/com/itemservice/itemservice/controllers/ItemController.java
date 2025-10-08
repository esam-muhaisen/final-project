import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/items")

public class ItemController {
    
    @Autowired
    private ItemService itemservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Item>> showAllItem(){
        List<Item> items = this.itemservice.getAllItems();
        return new ResponseEntity(items, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id){
        Item retrievedItme = this.itemservice.getItemById(id); 
        return new ResponseEntity<>(retrievedItem, HttpStatus.OK);
        
    }
    
    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        Item newItem = this.itemservice.addItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
        
    }
}
