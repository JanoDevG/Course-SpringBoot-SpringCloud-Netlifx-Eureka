package cl.janodevg.itemservice.service;

import cl.janodevg.itemservice.models.Item;
import cl.janodevg.itemservice.models.ItemService;
import cl.janodevg.itemservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Item> findAll() {
        return Arrays.stream(Objects.requireNonNull(restTemplate.getForObject("http://localhost:8001/product", Product[].class))).map(product -> new Item(product, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(long id, int number) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", String.valueOf(id));
        return new Item(restTemplate.getForObject("http://localhost:8001/product/{id}", Product.class, pathVariables), number);
    }
}
