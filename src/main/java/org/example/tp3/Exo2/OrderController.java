package org.example.tp3.Exo2;

import org.example.Order;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService os){
        this.orderService = os;
    }

    public boolean createOrder(Order or){
       return orderService.createOrder(or);
    }

}
