package com.sg.training.os.model;


import lombok.Data;

@Data
public class Order {

    private Integer orderId;
    private String orderName;
    private Integer quantity;
    public Order(Integer orderId,String orderName,  Integer quantity) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.quantity = quantity;
    }


}
