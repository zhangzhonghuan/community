package cn.zh.community.service;

import cn.zh.community.dto.NotificationDTO;
import cn.zh.community.dto.PaginationDTO;
import cn.zh.community.model.User;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 17:10
 * @description:
 */
public interface NotificationService {

     PaginationDTO list(Long userId, Integer page, Integer size);
     Long unreadCount(Long userId);
     NotificationDTO read(Long id, User user);

}
