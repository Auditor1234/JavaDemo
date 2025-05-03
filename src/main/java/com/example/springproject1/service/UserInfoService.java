package com.example.springproject1.service;

import com.example.springproject1.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    void add(UserInfo userInfo);
    void delete(Integer id);
    void update(UserInfo userInfo);
    UserInfo queryById(Integer id);
    List<UserInfo> queryAll();
}
