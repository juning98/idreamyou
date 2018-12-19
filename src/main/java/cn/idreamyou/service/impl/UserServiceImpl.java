package cn.idreamyou.service.impl;

import cn.idreamyou.entity.User;
import cn.idreamyou.entity.UserInfo;
import cn.idreamyou.mapper.UserMapper;
import cn.idreamyou.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
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

    @Override
    public UserInfo info(String username) {
        return null;
    }
}
