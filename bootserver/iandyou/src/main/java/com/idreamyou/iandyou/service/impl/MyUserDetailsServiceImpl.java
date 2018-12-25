package com.idreamyou.iandyou.service.impl;

import com.idreamyou.iandyou.constant.SecurityConstants;
import com.iandyou.common.entity.idreamyou.UserEntity;
import com.iandyou.common.entity.idreamyou.UserInfoEntity;
import com.idreamyou.iandyou.service.MyUserDetailsService;
import com.idreamyou.iandyou.service.UserService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Juning
 * @date 2018/12/18
 */
@Slf4j
@Service
@AllArgsConstructor
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userService.getOne(Wrappers.<UserEntity>query().lambda().eq(UserEntity::getUsername, username));
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }

        // 获取权限信息等相关信息（后期加上）
        Set<String> dbAuthsSet = new HashSet<>();
        dbAuthsSet.add("test");
        Collection<? extends GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(dbAuthsSet.toArray(new String[0]));

        return new UserInfoEntity(user.getId(), user.getUsername(), SecurityConstants.BCRYPT + user.getPassword(), authorities);
    }
}
