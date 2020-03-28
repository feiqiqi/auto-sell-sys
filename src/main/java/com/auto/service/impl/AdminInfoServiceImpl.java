package com.auto.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.auto.mapper.AdminInfoMapper;
import com.auto.entity.AdminInfo;
import com.auto.service.AdminInfoService;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {

    @Resource
    private AdminInfoMapper adminInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return adminInfoMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public int insert(AdminInfo record) {
        return adminInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(AdminInfo record) {
        return adminInfoMapper.insertSelective(record);
    }

    @Override
    public AdminInfo selectByPrimaryKey(Integer adminId) {
        return adminInfoMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminInfo record) {
        return adminInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdminInfo record) {
        return adminInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public AdminInfo adminToLogin(String adminName, String adminPwd, Integer adminRole) {
        return adminInfoMapper.adminToLogin(adminName, adminPwd, adminRole);
    }

}

