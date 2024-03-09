package com.techwey.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwey.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
