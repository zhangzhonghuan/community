package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:02
 * @description:
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
