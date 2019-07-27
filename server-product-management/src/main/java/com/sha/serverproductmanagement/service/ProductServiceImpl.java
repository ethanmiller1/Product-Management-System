package com.sha.serverproductmanagement.service;

import com.sha.serverproductmanagement.model.Product;
import com.sha.serverproductmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    // POST
    @Override
    public Product saveProduct(final Product product){
        productRepository.save(product);
        return product;
    }

    // UPDATE
    @Override
    public Product updateProduct(final Product product){
        return productRepository.save(product);
    }

    // DELETE
    @Override
    public void deleteProduct(final Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public Long numberOfProducts(){
        return productRepository.count();
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
