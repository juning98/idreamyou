package com.idreamyou.iandyou.service.service.impl;

import com.iandyou.common.client.iandyou.dto.UserDTO;
import com.iandyou.common.entity.idreamyou.UserEntity;
import com.iandyou.common.entity.idreamyou.UserInfoEntity;
import com.idreamyou.iandyou.service.service.UserService;
import com.idreamyou.iandyou.service.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现
 *
 * @author Juning
 * @date 2018/12/18
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();

    private final UserMapper userMapper;

    @Override
    public UserInfoEntity info(String username) {
        return null;
    }

    @Override
    public UserEntity updateById(Long id, UserDTO userDTO) {
        UserEntity user = userMapper.selectById(id);
        BeanUtils.copyProperties(userDTO, user);
        if (StringUtils.isNotBlank(userDTO.getNewPassword())) {
            user.setPassword(ENCODER.encode(userDTO.getNewPassword()));
        }
        userMapper.updateById(user);
        return user;
    }
}
