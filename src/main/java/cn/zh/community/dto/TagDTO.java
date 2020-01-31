package cn.zh.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:07
 * @description:
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
