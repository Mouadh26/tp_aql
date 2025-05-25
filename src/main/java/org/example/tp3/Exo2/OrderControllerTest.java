package org.example.tp3.Exo2;
import org.junit.jupiter.api.Test;

import static jdk.internal.classfile.impl.verifier.VerifierImpl.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class OrderControllerTest {


    OrderService orderService = mock(OrderService.class);
    OrderDao orderDao = mock(OrderDao.class);

    OrderController orderController = new OrderController(orderService);
    Order order = new Order(1,"nana");

    @Test
    void createOrderSuccess() {
        when(orderService.createOrder(order)).thenReturn(true);
        boolean result = orderController.createOrder(order);
        verify(orderService).createOrder(order);
        assertTrue(result);
    }

    @Test
    void createOrderFaillure() {
        when(orderService.createOrder(order)).thenReturn(false);
        boolean result = orderController.createOrder(order);
        verify(orderService).createOrder(order);
        assertEquals(result, false);
    }
    @Test
    void createOrderFaillureToSave() {
        when(orderDao.saveOrder(order)).thenReturn(false);
        boolean result = orderController.createOrder(order);
        verify(orderDao).saveOrder(order);
        assertEquals(result, false);
    }
}
