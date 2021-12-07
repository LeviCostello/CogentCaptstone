package com.cogent.springbootrestdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;
import com.cogent.springbootrestdemo1.service.ProductService;

@Controller
public class ProductControllerD {
	@Autowired
	ProductRepository productRepository;
	@GetMapping("/")
	public List<Product> viewhomePage(Model model)
	{
		List<Product> prdlist=productRepository.findAll();
		model.addAttribute("listdata",prdlist);
		return prdlist;
	}
	
	@GetMapping("/showNewProductForm")
    public String showNewProductForm(Model model) {
    	System.out.println("Coming here");
    	Product p=new Product();
    	model.addAttribute("prd",p);
    	return "new_product";
    }
	
	//@PostMapping("/addDetails")
	@PostMapping("/saveProduct")
	   public String saveProduct
	   (@ModelAttribute("prd") Product prd) {
	        // save employee to database
	        productRepository.save(prd);
	        return "redirect:/";//It works like a forward
	        // it will forward the request to request for /
	        //return "welcome";
	    }
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@PathVariable(value = "id") long id,Model m)
	{
	Product p=new Product();
	m.addAttribute("prd",p);
	return "update_product";
		
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(value = "id") int id) {
		this.productRepository.deleteById(id);
		return "redirect:/";
	}
	

	

}