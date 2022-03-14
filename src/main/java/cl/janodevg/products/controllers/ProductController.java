package cl.janodevg.products.controllers;

import cl.janodevg.products.models.entity.Product;
import cl.janodevg.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/product")
    public List<Product> list() {
        return iProductService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product product(@PathVariable long id) {
        return iProductService.findById(id).orElse(null);
    }
}
