package com.example.service.impl;

import com.example.dao.SysUserMapper;
import com.example.model.SysUser;
import com.example.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/4/12.
 */

@Service
public class SysUserImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectUserByName(String name) {

        return sysUserMapper.selectUserByName(name);
    }
}
