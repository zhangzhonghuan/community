package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:05
 * @description:
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
