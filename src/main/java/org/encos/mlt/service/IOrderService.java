package org.encos.mlt.service;

import org.encos.mlt.dto.OrderDto;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
public interface IOrderService {

    List<OrderDto> getOrders();
}
