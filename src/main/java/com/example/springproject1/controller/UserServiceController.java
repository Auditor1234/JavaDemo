package com.example.springproject1.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.example.springproject1.pojo.UserInfo;
import com.example.springproject1.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class UserServiceController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping
    @ResponseBody
    public String queryAll() {
        List<UserInfo> userInfoList = userInfoService.queryAll();
        return JSON.toJSONString(userInfoList);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String query(@PathVariable(value = "id")Integer id) {
        System.out.println("id = " + id);
        UserInfo userInfo = userInfoService.queryById(id);
        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(userInfo);
        return JSON.toJSONString(userInfoList);
    }

    @PostMapping
    @ResponseBody
    public String add(@RequestBody UserInfo userInfo) {
        userInfoService.add(userInfo);
        return "添加OK";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public String delete(@PathVariable("id")Integer id) {
        userInfoService.delete(id);
        return "删除成功";
    }

    @PutMapping("/{id}")
    @ResponseBody
    public String update(@PathVariable("id")Integer id, @RequestBody UserInfo userInfo) {
        userInfo.setId(id);
        userInfoService.update(userInfo);
        return "修改成功";
    }
}



































