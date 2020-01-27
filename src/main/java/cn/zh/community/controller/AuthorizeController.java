package cn.zh.community.controller;

import cn.zh.community.dto.AccessTokenDTO;
import cn.zh.community.dto.GithubUser;
import cn.zh.community.mapper.UserMapper;
import cn.zh.community.model.User;
import cn.zh.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/8 17:47
 * @Description:
 */
@Controller
public class AuthorizeController {

    /**
     * @Autowired自动的把容器的初始化好的实例加载给被注解的变量
     */
    @Autowired
    private GithubProvider githubProvider;

    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String redirectUri;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletResponse response) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        /*
        accessTokenDTO.setClient_id("6bb31e053f66281b93cb");
        accessTokenDTO.setClient_secret("4423fe2b0a3736da0e7435de0499be36df675592");
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
         */
        //使用配置文件
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setRedirect_uri(redirectUri);

        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        System.out.println(githubUser.getName());

        if (githubUser != null && githubUser.getId()!= null) {
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            user.setAvatarUrl(githubUser.getAvatarUrl());

            userMapper.insert(user);
            //把token放入cookie中，并向浏览器发送cookie
            response.addCookie(new Cookie("token",token));

            return "redirect:/";
        } else {
            //登陆失败，重新登录
            return "redirect:/";
        }

    }
}
