package com.example.dao;

import com.example.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 2018/4/12.
 */
@Mapper
@Repository
public interface SysUserMapper {
    public List<SysUser> selectUserByName(String name);
}
