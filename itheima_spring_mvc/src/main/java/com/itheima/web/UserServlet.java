package com.itheima.web;

import com.itheima.service.UserService;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangguanru
 * @date 2021-11-17
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext=this.getServletContext();
        //ApplicationContext app=(ApplicationContext) servletContext.getAttribute("app");
        //ApplicationContext app= WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext app=WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService=app.getBean(UserService.class);
        userService.save();
        // System.out.println("Spring容器创建完毕....");
    }

}
