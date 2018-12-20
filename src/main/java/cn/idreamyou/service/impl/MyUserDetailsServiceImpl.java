package cn.idreamyou.service.impl;

import cn.idreamyou.constant.SecurityConstants;
import cn.idreamyou.entity.User;
import cn.idreamyou.entity.UserInfo;
import cn.idreamyou.service.MyUserDetailsService;
import cn.idreamyou.service.UserService;
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
        User user = userService.getOne(Wrappers.<User>query().lambda().eq(User::getUsername, username));
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }

        // 获取权限信息等相关信息（后期加上）
        Set<String> dbAuthsSet = new HashSet<>();
        dbAuthsSet.add("test");
        Collection<? extends GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(dbAuthsSet.toArray(new String[0]));

        return new UserInfo(user.getId(), user.getUsername(), SecurityConstants.BCRYPT + user.getPassword(), authorities);
    }
}
