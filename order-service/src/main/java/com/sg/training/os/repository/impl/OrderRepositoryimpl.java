package com.sg.training.os.repository.impl;

import com.sg.training.os.model.Order;
import com.sg.training.os.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Repository
public class OrderRepositoryimpl implements OrderRepository {
    private static final Logger log = LoggerFactory.getLogger(OrderRepositoryimpl.class);

    @Override
    public List<Order> getAllOrder() {
        ArrayList<Order> orderArrayList = new ArrayList<>();
        orderArrayList.add(new Order(1,"Ramayan book",2));
        orderArrayList.add(new Order(2,"Bhagvat geeta Book",2));
       log.info("before returning response to service ..");
        return orderArrayList;
    }
}
