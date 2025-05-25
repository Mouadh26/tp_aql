package org.example.tp3.Environement.TP3.src.main.java.org.example;

public class OrderService {
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public boolean createOrder(Order or) {
        return orderDao.saveOrder(or) ;
    }
}
