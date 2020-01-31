package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/8 17:59
 * @Description:
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String Client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
