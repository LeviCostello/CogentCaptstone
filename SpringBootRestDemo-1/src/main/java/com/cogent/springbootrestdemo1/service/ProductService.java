package com.cogent.springbootrestdemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;

@Service
public interface ProductService {
	List < Product > getAllProducts();
    void saveEmployee(Product product);
    Product getProductById(long id);
    void deleteProductById(long id);
}
