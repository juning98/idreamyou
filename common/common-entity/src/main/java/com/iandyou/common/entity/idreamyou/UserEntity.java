package com.iandyou.common.entity.idreamyou;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 用户实体
 *
 * @author Juning
 * @date 2018/12/18
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user")
public class UserEntity extends Model<UserEntity> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String portrait;

    private String description;

    private Integer sex;

    private Date gmtCreate;

    private Date gmtModified;

}
