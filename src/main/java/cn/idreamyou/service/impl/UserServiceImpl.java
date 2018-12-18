package cn.idreamyou.service.impl;

import cn.idreamyou.entity.User;
import cn.idreamyou.mapper.UserMapper;
import cn.idreamyou.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
