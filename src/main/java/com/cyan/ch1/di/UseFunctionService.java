package com.cyan.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Cyan on 2017/9/21.
 *
 */
@Service
public class UseFunctionService {
    @Autowired//把FunctionService实体的Bean注入到UseFunctionService中,让UseFunctionService具有FunctionService的功能
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
