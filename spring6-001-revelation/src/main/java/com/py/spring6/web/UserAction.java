package com.py.spring6.web;

import com.py.spring6.service.UserService;
import com.py.spring6.service.impl.UserServiceImpl;

public class UserAction {
    private UserService userService = new UserServiceImpl();

    /***
     * 删除用户信息的请求
     */
    public void deleteUserRequest() {
        userService.deleteUser();
    }
}
