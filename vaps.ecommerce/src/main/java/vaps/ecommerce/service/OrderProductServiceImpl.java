package vaps.ecommerce.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaps.ecommerce.model.OrderProduct;
import vaps.ecommerce.repository.OrderProductRepository;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
