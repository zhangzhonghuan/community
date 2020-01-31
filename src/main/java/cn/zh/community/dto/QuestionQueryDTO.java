package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:07
 * @description:
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String sort;
    private Long time;
    private String tag;
    private Integer page;
    private Integer size;
}
