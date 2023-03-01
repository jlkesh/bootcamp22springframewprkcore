package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.*;
import dev.jlkeesh.springframeworkcore.config.MYConfig;
import dev.jlkeesh.springframeworkcore.config.MYConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MYConfig2.class);
        MyBean2 myBean = context.getBean(MyBean2.class);
        myBean.hi2();
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        System.out.println(context.getBean(BaseDAO.class));
        context.close();
    }
}