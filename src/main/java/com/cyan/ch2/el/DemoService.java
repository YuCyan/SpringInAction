package com.cyan.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Cyan on 2017/9/25.
 */
@Service
public class DemoService {
    @Value("其他类的属性")//注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
