package cl.janodevg.itemservice.controller;

import cl.janodevg.itemservice.models.Item;
import cl.janodevg.itemservice.models.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public List<Item> list() {
        return itemService.findAll();
    }

    @GetMapping("/list/{id}/number/{number}")
    public Item detail(@PathVariable long id, @PathVariable int number) {
        return itemService.findById(id, number);
    }

}
