package cn.idreamyou.entity;

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
public class UserInfo extends User {

    @Getter
    private Long id;

    public UserInfo(Long id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
    }
}
