package cn.idreamyou.service.impl;

import cn.idreamyou.dto.UserDTO;
import cn.idreamyou.entity.User;
import cn.idreamyou.entity.UserInfo;
import cn.idreamyou.mapper.UserMapper;
import cn.idreamyou.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();

    private final UserMapper userMapper;

    @Override
    public UserInfo info(String username) {
        return null;
    }

    @Override
    public User updateById(Long id, UserDTO userDTO) {
        User user = userMapper.selectById(id);
        BeanUtils.copyProperties(userDTO, user);
        if (StringUtils.isNotBlank(userDTO.getNewPassword())) {
            user.setPassword(ENCODER.encode(userDTO.getNewPassword()));
        }
        userMapper.updateById(user);
        return user;
    }
}
