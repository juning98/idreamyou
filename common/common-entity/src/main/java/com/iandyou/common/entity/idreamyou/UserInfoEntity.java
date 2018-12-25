package com.iandyou.common.entity.idreamyou;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * 扩展用户信息
 *
 * @author Juning
 * @date 2018/12/18
 */
public class UserInfoEntity extends User {

    @Getter
    private Long id;

    public UserInfoEntity(Long id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
    }
}
