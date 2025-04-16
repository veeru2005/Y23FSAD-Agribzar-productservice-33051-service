package com.agribzar.productservice.service;
import com.agribzar.productservice.model.Product;
import com.agribzar.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getproductById(Long productId) {
        return productRepository.findById(productId);
    }

    public Product addProduct(Product product) {
        return productRepository.save((product));
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

}
