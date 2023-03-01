package dev.jlkeesh.springframeworkcore.config;

import dev.jlkeesh.springframeworkcore.beans.MyBean;
import dev.jlkeesh.springframeworkcore.beans.MyBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MYConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
    @Bean
    public MyBean2 myBean2() {
        MyBean2 myBean2 = new MyBean2();
        myBean2.setMyBean(myBean());
        return myBean2;
    }

}
