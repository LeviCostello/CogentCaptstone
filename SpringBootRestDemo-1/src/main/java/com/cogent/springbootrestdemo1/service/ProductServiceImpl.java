package com.cogent.springbootrestdemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    private ProductRepository productRepository;

    public List < Product > getAllProducts() {
        return productRepository.findAll();
    }

    public void saveEmployee(Product prd) {
        this.productRepository.save(prd);
    }

    @Override
    public Product getProductById(long id) {
        Optional < Product > optional =
        		productRepository.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException(" Product not found for id :: " + id);
        }
        return product;
    }

    public void deleteProductById(long id) {
        this.productRepository.deleteById(id);
    }
}
