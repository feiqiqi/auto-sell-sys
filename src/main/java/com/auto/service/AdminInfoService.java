package com.auto.service;

import com.auto.entity.AdminInfo;
import org.apache.ibatis.annotations.Param;

public interface AdminInfoService {


    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);


    /**
     * 登录
     *
     * @param adminName 登录名
     * @param adminPwd  登录密码
     * @return
     */
    AdminInfo adminToLogin(String adminName, String adminPwd,Integer adminRole);


}

