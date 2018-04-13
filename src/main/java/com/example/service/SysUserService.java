package com.example.service;

import com.example.model.SysUser;

import java.util.List;

/**
 * Created by admin on 2018/4/12.
 */
public interface SysUserService {
    public List<SysUser> selectUserByName(String name);
}
