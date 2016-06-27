package org.encos.examples.service.impl;

import org.encos.examples.dto.OrderDto;
import org.encos.examples.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
@Service
public class OrderService implements IOrderService{

    Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Override
    public List<OrderDto> getOrders() {
        logger.info("Hello I'm the default order service");
        return null;
    }
}
