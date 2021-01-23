package com.rest1.bootstrap;

import com.rest1.entity.Product;
import com.rest1.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DataGenerator implements CommandLineRunner {

    private ProductRepository productRepository;

    public DataGenerator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Product pc = new Product("Dell");
        Product laptop = new Product("Macbook");
        Product phone = new Product("Iphone");
        Product tablet = new Product("Ipad");

        productRepository.save(pc);
        productRepository.save(laptop);
        productRepository.save(phone);
        productRepository.save(tablet);
    }
}
