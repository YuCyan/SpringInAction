package com.cyan.ch1.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cyan on 2017/9/25.
 */
@Configuration//声明当前是一个配置类
public class JavaConfig {

//    JavaConfig(){
//        System.out.println("JavaConfig");
//    }
    @Bean//声明当前方法返回的值是一个Bean，名称即方法名
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        // 注入FunctionService的Bean的时候直接调用functionService()
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

//    @Bean
//    //以参数的形式将Bean传递给useFunctionService(),
//    public UseFunctionService useFunctionService2(FunctionService functionService) {
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
