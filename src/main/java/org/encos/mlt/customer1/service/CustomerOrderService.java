package org.encos.mlt.customer1.service;

import org.encos.mlt.core.dto.OrderDto;
import org.encos.mlt.core.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Enrico Costanzi
 */
@Service
@Primary
public class CustomerOrderService implements IOrderService{

    Logger logger = LoggerFactory.getLogger(CustomerOrderService.class);

    @Override
    public List<OrderDto> getOrders() {
        logger.info("Hello I'm the customer 1 order service!");
        return Arrays.asList(
                new OrderDto(1000L, "Customer 1"));
    }
}
