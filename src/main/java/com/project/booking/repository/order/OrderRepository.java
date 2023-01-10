package com.project.booking.repository.order;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.booking.model.Customer;
import com.project.booking.model.order.Order;



public interface OrderRepository extends MongoRepository<Order, Integer> {
    Order insert(Order order);

    List<Order> findByCustomer(Customer customer);

    Order findById(String orderId);

    Long deleteOrderById(String id);
}