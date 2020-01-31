package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/8 19:07
 * @Description:
 */
@Data
public class GithubUser {

    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
