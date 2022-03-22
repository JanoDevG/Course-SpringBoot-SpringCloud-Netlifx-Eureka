package cl.janodevg.itemservice.models;

import java.util.List;

public interface ItemService {

    List<Item> findAll();
    Item findById(long id, int number);

}
