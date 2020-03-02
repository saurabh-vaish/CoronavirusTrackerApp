package com.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@ControllerAdvice
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "error";
    }

    @RequestMapping("/404")
    public String handle404Error() {
        //do something like logging
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @ExceptionHandler({Exception.class})
    public String handleException()
    {
        return "error";
    }

}