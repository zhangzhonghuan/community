package cn.zh.community.service.impl;

import cn.zh.community.mapper.NavMapper;
import cn.zh.community.model.Nav;
import cn.zh.community.model.NavExample;
import cn.zh.community.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:13
 * @description:
 */
@Service
public class NavServiceImpl implements NavService {
    @Autowired
    private NavMapper navMapper;

    @Override
    public List<Nav> list() {
        NavExample navExample = new NavExample();
        navExample.createCriteria()
                .andStatusEqualTo(1);
        navExample.setOrderByClause("priority desc");
        List<Nav> navs = navMapper.selectByExample(navExample);
        return navs;
    }
}
