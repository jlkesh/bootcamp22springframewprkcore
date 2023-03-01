package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.MyBean;
import dev.jlkeesh.springframeworkcore.beans.MyBean2;
import dev.jlkeesh.springframeworkcore.config.MYConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MYConfig.class);
        MyBean2 myBean = context.getBean(MyBean2.class);
        myBean.hi2();
    }
}