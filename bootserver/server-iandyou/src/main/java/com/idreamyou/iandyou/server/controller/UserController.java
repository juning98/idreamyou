package com.idreamyou.iandyou.service.controller;

import com.iandyou.common.entity.idreamyou.UserEntity;
import com.idreamyou.iandyou.api.login.UserControllerApi;
import com.idreamyou.iandyou.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
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
    public UserEntity provinceListBySelective(@PathVariable Long id) throws Exception {
        logger.info("查询一个");
        return userService.getById(id);
    }

    @Override
    public String test(Long id) throws Exception {
        logger.info("测试成功");
        return "成功,id值："+id;
    }
}
