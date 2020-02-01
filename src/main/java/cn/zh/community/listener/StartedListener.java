package cn.zh.community.listener;

import cn.zh.community.service.OptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 19:28
 * @description:
 */
@Slf4j
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {

    @Autowired
    private OptionService optionService;


    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {

        this.printStartInfo();
    }

    private void printStartInfo() {

        String communityUrl = optionService.getCommunityBaseUrl();

        log.info("Community started at         {}", communityUrl);
        log.info("Community has started successfully!");
    }

}
