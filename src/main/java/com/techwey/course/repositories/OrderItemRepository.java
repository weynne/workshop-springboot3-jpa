package com.techwey.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwey.course.entities.OrderItem;
import com.techwey.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
