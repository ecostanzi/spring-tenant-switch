package org.encos.examples.controller;

import org.encos.examples.dto.OrderDto;
import org.encos.examples.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
@RestController
public class OrderController {

    private IOrderService orderService;

    @Autowired
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping
    private List<OrderDto> getOrders(){
        return orderService.getOrders();
    }
}
