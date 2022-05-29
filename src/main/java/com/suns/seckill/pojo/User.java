package com.suns.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author shuo.sun
 * @since 2022-05-29
 */
@Getter
@Setter
@TableName("t_user")
@ApiModel(value = "User对象", description = "用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID, 手机号码")
    private Long id;

    private String nickname;

    @ApiModelProperty("MD5(MD5(orig password + salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty("头像")
    private String avator;

    @ApiModelProperty("注册时间")
    private LocalDateTime registerDate;

    @ApiModelProperty("最后登录时间")
    private LocalDateTime lastLoginDate;

    @ApiModelProperty("登录次数")
    private Integer loginCount;


}
