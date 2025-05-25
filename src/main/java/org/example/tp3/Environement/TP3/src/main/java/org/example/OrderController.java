package org.example.tp3.Environement.TP3.src.main.java.org.example;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService os){
        this.orderService = os;
    }

    public boolean createOrder(Order or){
       return orderService.createOrder(or);
    }

}
