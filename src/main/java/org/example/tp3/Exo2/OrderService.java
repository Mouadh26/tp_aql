package org.example.tp3.Exo2;

import org.example.Order;

public class OrderService {
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public boolean createOrder(Order or) {
        return orderDao.saveOrder(or) ;
    }
}
