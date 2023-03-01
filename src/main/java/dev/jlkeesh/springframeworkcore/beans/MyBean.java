package dev.jlkeesh.springframeworkcore.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean {
    public void hi() {
        System.out.println("Hello PDP");
    }

    // @PostConstruct
    public void init() {
        System.out.println("Init Method Called");
    }

    // @PreDestroy
    public void destroy() {
        System.out.println("Destroy Method Called");
    }
}
