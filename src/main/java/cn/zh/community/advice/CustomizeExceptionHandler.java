package cn.zh.community.advice;

import cn.zh.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhanghuan
 * @date: 2020/1/29 19:06
 * @description: 异常处理
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(HttpServletRequest request,Throwable e, Model model) {
        if (e instanceof CustomizeException) {
            model.addAttribute("message",e.getMessage());
        } else {
            model.addAttribute("message","服务器冒烟了，要不然你稍后在试试！");
        }
        return  new ModelAndView("error");
    }
}
