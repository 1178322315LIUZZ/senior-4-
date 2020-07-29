package com.liuzhenzhen.liuzhenzhencfs.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author thyu
 * @title: GlobalExceptionHandler
 * @projectName yutianhao-week1
 * @description: TODO
 * @date 2020/7/7 20:22
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public boolean defaultErrorHandler(HttpServletRequest request, HttpServletResponse response,Exception ex) throws Exception {
        log.info("统一异常处理范false数据");
        return false;
    }

}