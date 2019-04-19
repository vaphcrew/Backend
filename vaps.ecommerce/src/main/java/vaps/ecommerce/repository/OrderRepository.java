package vaps.ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import vaps.ecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}