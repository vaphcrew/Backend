package vaps.ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import vaps.ecommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}