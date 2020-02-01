package cn.zh.community.service.impl;

import cn.zh.community.config.properties.CommunityProperties;
import cn.zh.community.service.OptionService;
import cn.zh.community.utils.CommunityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 19:33
 * @description:
 */
@Service
public class OptionServiceImpl implements OptionService {
    @Value("${server.port}")
    private String port;
    @Autowired
    private CommunityProperties communityProperties;
    /**
     * 获取访问路径
     * @return
     */
    @Override
    public String getCommunityBaseUrl() {
        // Get server port

        String blogUrl = null;

        if (communityProperties.isProductionEnv()) {
            blogUrl = String.format("http://%s:%s", "127.0.0.1", port);
        } else {
            blogUrl = String.format("http://%s:%s", CommunityUtils.getMachineIP(), port);
        }
        return blogUrl;
    }

}
