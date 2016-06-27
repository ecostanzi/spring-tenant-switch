package org.encos.examples.service;

import org.encos.examples.dto.OrderDto;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
public interface IOrderService {

    List<OrderDto> getOrders();
}
