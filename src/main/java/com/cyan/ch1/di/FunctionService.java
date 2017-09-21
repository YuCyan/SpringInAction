package com.cyan.ch1.di;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 * Created by Cyan on 2017/9/21.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello"+word;
    }
}
