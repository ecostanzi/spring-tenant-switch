package org.encos.mlt.core.service;

import org.encos.mlt.core.MultitenancyApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Enrico Costanzi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MultitenancyApplication.class)
@PropertySource("classpath:application-customer1.properties")
public class OrderServiceTest {

    @Autowired
    private IOrderService orderService;

    @Test
    public void test(){
        Assert.assertEquals("customer1", orderService.getOrders().get(0).getItem());
    }
}
