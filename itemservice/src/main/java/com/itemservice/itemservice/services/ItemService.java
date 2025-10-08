
package com.itemservice.itemservice.services;

import com.itemservice.itemservice.models.Item;
import com.itemservice.itemservice.repositories.ItemRepository;
import java.util.List;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;
    
    public List<Item> getAllItems(){
        return this.itemRepository.findAll();
    }
    
    public Item getItemById(Long id){
        return this.itemRepository.findById(id).get();
    }
    
    public Item addItem(Item item){
        return this.itemRepository.save(item);
    }
    
    
    
}
