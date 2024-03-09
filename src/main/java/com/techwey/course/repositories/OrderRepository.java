package com.techwey.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwey.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
