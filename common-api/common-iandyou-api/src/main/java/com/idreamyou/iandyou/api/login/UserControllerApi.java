package com.idreamyou.iandyou.login;

import com.iandyou.common.entity.idreamyou.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

/**
 * 用户模块api
 *
 * @author yin
 * <br> Date : 2018-12-25 23:39
 * <br> Copyright (c) 2018 ASPire Tech.
 */
@Api(value = "/user", tags = "用户模块")
@RequestMapping("/user")
@RestController
public interface UserControllerApi {

    @ApiOperation(value = "根据用户ID获取用户信息", notes = "根据用户ID获取用户信息")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 500, message = "内部错误"), @ApiResponse(code = 400, message = "参数错误")})
    @GetMapping(value = "/{id}")
    UserEntity provinceListBySelective(@PathVariable Long id) throws Exception;

    @GetMapping(value = "/test")
    String test(@PathVariable Long id) throws Exception;

}
