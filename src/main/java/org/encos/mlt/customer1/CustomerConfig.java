package org.encos.mlt.customer1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Enrico Costanzi
 */
@Configuration
@ComponentScan(basePackages = "org.encos.mlt.customer2")
public class CustomerConfig {
}
