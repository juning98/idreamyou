package cn.idreamyou.service;

import cn.idreamyou.dto.UserDTO;
import cn.idreamyou.entity.User;
import cn.idreamyou.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author Juning
 * @date 2018/12/18
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户信息（包括权限信息等。。）
     * @param username 用户名
     * @return 用户详细信息
     */
    public UserInfo info(String username);

    /**
     * 更新用户信息
     * @param id 用户ID
     * @param userDTO 用户DTO
     * @return 更新后的用户信息
     */
    public User updateById(Long id, UserDTO userDTO);

}
