package dev.jlkeesh.springframeworkcore.beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class B {
    private final A a;

    public B(@Lazy A a) {
        this.a = a;
    }
}
