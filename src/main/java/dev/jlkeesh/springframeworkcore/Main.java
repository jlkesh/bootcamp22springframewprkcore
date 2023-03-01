package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.*;
import dev.jlkeesh.springframeworkcore.config.MYConfig;
import dev.jlkeesh.springframeworkcore.config.MYConfig2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("ioc-settings.xml");
        BeanFactory context = new XmlBeanFactory(resource);
        Person person = context.getBean(Person.class);
        System.out.println(person);

        /*MyBean2 myBean = context.getBean(MyBean2.class);
        myBean.hi2();
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        System.out.println(System.identityHashCode(context.getBean(MyBean.class)));
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        System.out.println(context.getBean(BaseDAO.class));
        System.out.println(context.getBean(HomeController.class));
        context.close();*/
    }
}