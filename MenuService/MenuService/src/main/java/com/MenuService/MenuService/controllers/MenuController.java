import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/menu")

public class MenuController {
    
    @Autowired
    private MenuService menuservice;
    
    @GetMapping("/")
    public ResponseEntity<List<Menu>> showAllMenu(){
        List<Menu> menu = this.menuservice.getAllMenu();
        return new ResponseEntity(menu, HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable Long id){
        Menu retrievedMenu = this.menuservice.getMenuById(id); 
        return new ResponseEntity<>(retrievedMenu, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu){
        Menu newMenu = this.menuservice.addMenu(menu);
        return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
    
    }
}
