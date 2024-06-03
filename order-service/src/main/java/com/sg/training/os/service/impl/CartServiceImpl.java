package com.sg.training.os.service.impl;

import com.sg.training.os.model.Order;
import com.sg.training.os.repository.OrderRepository;
import com.sg.training.os.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CartServiceImpl implements CartService {

    private static final Logger log = LoggerFactory.getLogger(CartServiceImpl.class);
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getOrderInfo() {
        log.info("Before calling repository ..");
      return  orderRepository.getAllOrder();
    }
}
