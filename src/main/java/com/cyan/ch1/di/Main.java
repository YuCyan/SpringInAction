package com.cyan.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * Created by Cyan on 2017/9/21.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        context.close();
    }
}
