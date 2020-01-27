package cn.zh.community.controller;

import cn.zh.community.dto.PaginationDTO;
import cn.zh.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhanghuan
 * @Date: 2019/10/7 14:53
 * @Description: 首页
 * @Description:
 */
@Controller
public class
IndexController {

    @Autowired
    private QuestionService questionService;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {


        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);

        return "index";

    }
}
