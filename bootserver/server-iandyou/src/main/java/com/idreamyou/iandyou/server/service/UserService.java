package com.idreamyou.iandyou.service.service;

import com.iandyou.common.client.iandyou.dto.UserDTO;
import com.iandyou.common.entity.idreamyou.UserEntity;
import com.iandyou.common.entity.idreamyou.UserInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author Juning
 * @date 2018/12/18
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 根据用户名查询用户信息（包括权限信息等。。）
     *
     * @param username 用户名
     * @return 用户详细信息
     */
    public UserInfoEntity info(String username);

    /**
     * 更新用户信息
     *
     * @param id      用户ID
     * @param userDTO 用户DTO
     * @return 更新后的用户信息
     */
    public UserEntity updateById(Long id, UserDTO userDTO);

}
