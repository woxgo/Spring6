package com.py.proxy.client;

import com.py.proxy.service.OrderService;
import com.py.proxy.service.OrderServiceImpl;
import com.py.proxy.service.OrderServiceImplSub;
import com.py.proxy.service.OrderServiceProxy;

/**
 * @author PengYang
 * @version 1.0
 * @className Test
 * @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        // OrderService orderService = new OrderServiceImpl();
        // orderService.generate();
        // orderService.detail();
        // orderService.modify();

        // OrderService orderService = new OrderServiceImplSub();
        // orderService.generate();
        // orderService.detail();
        // orderService.modify();

        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
