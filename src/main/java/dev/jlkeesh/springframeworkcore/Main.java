package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.MyBean;
import dev.jlkeesh.springframeworkcore.beans.MyBean2;
import dev.jlkeesh.springframeworkcore.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean2 myBean2 = (MyBean2) context.getBean("myBean2");
        MyBean2 myBean2_2 = (MyBean2) context.getBean("myBean2");
        System.out.println(System.identityHashCode(myBean2));
        System.out.println(System.identityHashCode(myBean2_2));
    }
}