package com.prateekb.footbalApp.interceptor;

import com.prateekb.footbalApp.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Iterator;

@Component
public class ApiInterceptor implements HandlerInterceptor {

    String authToken;

    public ApiInterceptor(){}
    public ApiInterceptor(String token){
        this.authToken = token;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getHeader("Authorization") == null)
            throw new ApplicationException("Authorization Header Not Present", "UNAUTHORIZED_ACCESS", 401);
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String header = headerNames.nextElement();
            if(header.equalsIgnoreCase("Authorization")){
                if(!request.getHeader(header).equalsIgnoreCase(authToken)){
                    throw new ApplicationException("Auth token not verified", "UNAUTHORIZED_ACCESS", 401);
                }
            }
        }
        return true;
    }
}
