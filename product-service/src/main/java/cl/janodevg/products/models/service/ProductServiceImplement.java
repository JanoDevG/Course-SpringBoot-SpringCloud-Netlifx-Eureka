package cl.janodevg.products.models.service;

import cl.janodevg.products.models.dao.ProductDao;
import cl.janodevg.products.models.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements IProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(long id) {
        return productDao.findById(id);
    }
}
