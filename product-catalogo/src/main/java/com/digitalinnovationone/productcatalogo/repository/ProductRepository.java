package com.digitalinnovationone.productcatalogo.repository;

import com.digitalinnovationone.productcatalogo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}