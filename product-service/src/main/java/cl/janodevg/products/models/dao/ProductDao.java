package cl.janodevg.products.models.dao;

import cl.janodevg.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
    
}
