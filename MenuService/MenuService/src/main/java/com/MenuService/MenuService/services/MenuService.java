
package com.menuservice.menuservice.services;

import com.menuservice.menuservice.models.Menu;
import com.menuservice.menuservice.repositories.MenuRepository;
import java.util.List;

@Service
public class MenuService {
    
    @Autowired
    private MenuRepository menurepository;
    
    public List<Menu> getAllMenu(){
        return this.menurepository.findAll();
    }
    
    public Menu getMenuById(Long id){
        return this.menurepository.findById(id).get();
    }
    
    public Menu addMenu(Menu menu){
        return this.menurepository.save(item);
    }
    
    
    
}
