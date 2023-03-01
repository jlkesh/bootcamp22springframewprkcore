package dev.jlkeesh.springframeworkcore;

import dev.jlkeesh.springframeworkcore.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ic-config.xml");
        /*context.setConfigLocation("ic-config.xml");
        context.refresh();*/
        /*MyBean2 myBean = context.getBean(MyBean2.class);
        myBean.hi2();*/
        System.out.println("Getting Person bean from container");
       /* Person person = context.getBean(Person.class);
        System.out.println(person);*/
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        Service service = context.getBean("userService", Service.class);
        System.out.println(service);
        Controller controller = context.getBean(Controller.class);
        System.out.println(controller);
        controller = context.getBean(Controller.class);
        System.out.println(controller);
        controller = context.getBean(Controller.class);
        System.out.println(controller);
        controller = context.getBean(Controller.class);
        System.out.println(controller);
        context.close();
    }
}