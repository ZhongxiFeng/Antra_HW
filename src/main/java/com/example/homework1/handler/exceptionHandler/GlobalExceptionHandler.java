package com.example.homework1.handler.exceptionHandler;

import lombok.Data;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-10:52 PM
 * @description
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ExceptionHandlerResult handleArithmeticException(Exception e){
        ExceptionHandlerResult exceptionHandlerResult = new ExceptionHandlerResult();
        exceptionHandlerResult.setExceptionType(e.getClass().toString());
        exceptionHandlerResult.setMessage("some message");
        //exceptionHandlerResult.setMessage(e.getCause().getMessage());
        return exceptionHandlerResult;
    }

    @Data
    class ExceptionHandlerResult{
        String exceptionType;
        String message;
    }

}


