package com.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository 內建很多方法 ex : findAll(), findAll(sort), findAllById()...
public interface ProductRepository extends JpaRepository<Product, Long>{		//識別物件類別, id型別

}
