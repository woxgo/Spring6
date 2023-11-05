package com.py.spring6.test;

import com.py.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author PengYang
 * @version 1.0
 * @className SMTest
 * @since 1.0
 **/
public class SMTest {

    @Test
    public void testSM(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
