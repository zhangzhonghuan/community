package cn.zh.community.service;

import cn.zh.community.model.Ad;

import java.util.List;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 17:07
 * @description:
 */
public interface AdService {

     List<Ad> list(String pos);
}
