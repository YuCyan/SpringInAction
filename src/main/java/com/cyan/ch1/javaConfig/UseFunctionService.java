package com.cyan.ch1.javaConfig;

/**
 * Created by Cyan on 2017/9/25.
 */
//无需用@Service声明Bean
public class UseFunctionService {

//    UseFunctionService(){
//        System.out.println("UseFunctionService");
//    }
    //无需@Autowired注入Bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
