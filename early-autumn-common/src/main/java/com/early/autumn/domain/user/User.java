package com.early.autumn.domain.user;


import com.early.autumn.constant.user.GenderEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 用户信息
 */
@Getter
@Setter
@NoArgsConstructor
public class User {
    //逻辑主键
    private Long id;
    //头像
    private String headPortrait;
    //性别
    private GenderEnum gender;
    //出生日期;
    private Date birthday;
    //签名
    private String individualitySignature;
    //用户组id
    private Integer groupId;
    //城市id
    private Integer cityId;
    //创建时间
    private Date createTime;
    //上次修改时间
    private Date lastUpdateTime;

}