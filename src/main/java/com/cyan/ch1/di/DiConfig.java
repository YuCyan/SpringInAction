package com.cyan.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cyan on 2017/9/21.
 */
@Configuration//声明配置类
@ComponentScan("com.cyan.ch1.di")//自动扫描指定包下的@Service,@Component,@Reposistory,@Controller等并注册为Bean
public class DiConfig {

}
