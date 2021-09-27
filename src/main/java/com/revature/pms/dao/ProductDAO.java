package com.revature.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.pms.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{

}
