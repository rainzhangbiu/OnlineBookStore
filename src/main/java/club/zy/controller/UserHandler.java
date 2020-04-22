package club.zy.controller;

import club.zy.entity.Account;
import club.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zyyy
 */

@RestController
public class UserHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/login/{account}")
    public Account login(@PathVariable("account") long account) {
        return userService.login(account);
    }

    @GetMapping("/register/{account}/{password}")
    public int register(@PathVariable("account") long account, @PathVariable("password") String password) {
        // 处理异常
        try {
            return userService.register(account, password);
        } catch (Exception e) {
            return 0;
        }
    }
}
