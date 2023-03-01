package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.MyBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ic-config.xml");
        /*context.setConfigLocation("ic-config.xml");
        context.refresh();*/
        MyBean2 myBean = context.getBean(MyBean2.class);
        myBean.hi2();
    }
}