package com.auto.mapper;

import com.auto.entity.AdminInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminInfoMapper {
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
    AdminInfo adminToLogin(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd, @Param("adminRole") Integer adminRole);
}