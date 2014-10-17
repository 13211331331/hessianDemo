package com.hhl;

import com.hhl.service.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2014/10/16.
 */
public class HessianTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("remoting-servlet.xml");  //这里只是你声明的bean的xml文件所在的路径
        IHello b = (IHello) context.getBean("myServiceClient");
        System.out.println(b.sayHello());
    }
}
