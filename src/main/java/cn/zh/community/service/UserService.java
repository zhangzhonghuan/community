package cn.zh.community.service;

import cn.zh.community.model.User;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 17:11
 * @description:
 */
public interface UserService {

    void createOrUpdate(User user);
}
