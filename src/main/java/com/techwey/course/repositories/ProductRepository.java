package com.techwey.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwey.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
