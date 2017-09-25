package com.cyan.ch1.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Cyan on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService1 = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService1.sayHello("JavaConfig"));
        context.close();

    }
}
