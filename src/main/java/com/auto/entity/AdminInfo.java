package com.auto.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AdminInfo implements Serializable {
    /**
     * 管理员id
     */
    private Integer adminId;

    /**
     * 管理员登录名
     */
    private String adminName;

    /**
     * 管理员手机号
     */
    private String adminPhone;

    /**
     * 邮箱号
     */
    private String adminEmail;

    /**
     * 管理员角色
     */
    private String adminRole;

    /**
     * 启用状态(0:启用1:禁用)
     */
    private Integer adminStatus;

    /**
     * 加入时间
     */
    private Date regTime;

    private static final long serialVersionUID = 1L;
}