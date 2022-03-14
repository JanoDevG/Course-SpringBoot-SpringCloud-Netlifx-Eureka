package cl.janodevg.products.models.service;

import cl.janodevg.products.models.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();

    Optional<Product> findById(long id);

}
