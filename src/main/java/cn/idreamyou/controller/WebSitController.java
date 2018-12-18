package cn.idreamyou.controller;

import cn.idreamyou.entity.User;
import cn.idreamyou.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class WebSitController {

    private final UserService userService;

    @RequestMapping("/index.html")
    public List<User> index() {
        List<User> userList = userService.list();
        userList.forEach(user -> System.out.printf(user.toString()));
        return userList;
    }

}
