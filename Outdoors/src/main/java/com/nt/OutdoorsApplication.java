package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nt.service.impl.ServiceImpl;

@SpringBootApplication
public class OutdoorsApplication implements CommandLineRunner{
	
	@Autowired
	private ServiceImpl userService;

	public static void main(String[] args) {
		SpringApplication.run(OutdoorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("code started");
		
	}
	
//	@Bean(name="entityManagerFactory")
//	public LocalSessionFactoryBean sessionFactory() {
//	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	    return sessionFactory;
//	} 

}
