package com.itheima.proxy.cglib;

/**
 * @author wangguanru
 * @date 2021-12-08
 */
public class Advice {

    public void before(){
        System.out.println("前置增强.....");
    }

    public void afterReturning(){
        System.out.println("后置增强....");
    }

}