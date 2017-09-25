package com.cyan.ch1.di;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 * 使用@Component，@Service，@Repository，@Controller等效
 * Created by Cyan on 2017/9/21.
 */
@Service//声明当前类是一个Spring管理的Bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello Spring "+word;
    }
}
