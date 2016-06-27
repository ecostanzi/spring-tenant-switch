package org.encos.mlt.core.service;

import org.encos.mlt.core.dto.OrderDto;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
public interface IOrderService {

    List<OrderDto> getOrders();
}
