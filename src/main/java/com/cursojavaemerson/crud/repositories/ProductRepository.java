package com.cursojavaemerson.crud.repositories;

import com.cursojavaemerson.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
