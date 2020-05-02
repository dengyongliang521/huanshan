package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: dengYongLiang
 * @Date: 2020/04/15 20:44
 * @Description:
 * @Version 1.0
 */
@RestControllerAdvice
public class baseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        return new Result(true, StatusCode.ERROR, e.getMessage());
    }
}
