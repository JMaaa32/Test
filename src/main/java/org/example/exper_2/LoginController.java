package org.example.exper_2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return "登录成功";
        } else {
            return "用户名或密码错误";
        }
    }

    @GetMapping("/user")
    public String getUserInfo() {
        return "用户信息：张三，角色：管理员";
    }
}

