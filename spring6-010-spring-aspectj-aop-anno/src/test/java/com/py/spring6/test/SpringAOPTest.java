package com.py.spring6.test;

import com.py.spring6.service.OrderService;
import com.py.spring6.service.Spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author PengYang
 * @version 1.0
 * @className SpringAOPTest
 * @since 1.0
 **/
public class SpringAOPTest {

    @Test
    public void testNoXml(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        /*UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
        userService.logout();*/

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
