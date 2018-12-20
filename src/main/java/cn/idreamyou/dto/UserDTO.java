package cn.idreamyou.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户DTO
 *
 * @author Juning
 * @date 2018/12/18
 */
@Data
@ToString
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank
    private String username;

    @ApiModelProperty(value = "密码")
    private String newPassword;

    @ApiModelProperty(value = "手机号码", required = true)
    @NotBlank
    private String phone;

    @ApiModelProperty(value = "头像", required = true)
    private String portrait;

    @ApiModelProperty(value = "简介", required = true)
    private String description;

    @ApiModelProperty(value = "性别", required = true)
    @NotNull
    private Integer sex;

}
