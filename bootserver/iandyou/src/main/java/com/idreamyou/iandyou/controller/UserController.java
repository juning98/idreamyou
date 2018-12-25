package com.idreamyou.iandyou.controller;

import com.iandyou.common.entity.idreamyou.UserEntity;
import com.idreamyou.iandyou.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 *
 * @author Juning
 * @date 2018/12/20
 */
@Api(value = "/user", tags = "用户模块")
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @ApiOperation(value = "根据用户ID获取用户信息", notes = "根据用户ID获取用户信息")
    @GetMapping(value = "/{id}")
    public UserEntity getById(@PathVariable Long id){
        return userService.getById(id);
    }
}
