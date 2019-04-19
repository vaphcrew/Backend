package vaps.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import vaps.ecommerce.model.OrderProduct;
import vaps.ecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}