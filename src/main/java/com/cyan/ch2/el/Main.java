package com.cyan.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Cyan on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig resourceService = context.getBean(ELConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
