package com.example.controller;

import com.example.model.SysUser;
import com.example.service.SysUserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/4/12.
 */

@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @RequestMapping(value = "/query")
    public ModelAndView selectUser(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("query");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/query_table")
    public String queryUser(){
        List<SysUser> list =sysUserService.selectUserByName("123");
        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.size());
        map.put("data",JSONArray.fromObject(list));
        JSONArray jsonArray =JSONArray.fromObject(map);
        JSONObject jsonObject =jsonArray.getJSONObject(0);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
}
