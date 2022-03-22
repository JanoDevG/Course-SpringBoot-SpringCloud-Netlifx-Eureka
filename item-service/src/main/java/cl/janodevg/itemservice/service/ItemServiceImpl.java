package cl.janodevg.itemservice.service;

import cl.janodevg.itemservice.models.Item;
import cl.janodevg.itemservice.models.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(long id, int number) {
        return null;
    }
}
