package com.idreamyou.iandyou.server.controller;

import com.iandyou.common.entity.idreamyou.UserEntity;
import com.idreamyou.iandyou.api.UserControllerApi;
import com.idreamyou.iandyou.server.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 用户
 *
 * @author Juning
 * @date 2018/12/20
 */

@RestController
@AllArgsConstructor
public class UserController  extends BaseController implements UserControllerApi{

    private final UserService userService;

    @Override
    public UserEntity provinceListBySelective(@PathVariable Long id) {
        logger.info("测试查询用户一个");
        return userService.getById(id);
    }
}
