package dev.jlkeesh.springframeworkcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {
    private final Service service;

    @Autowired // @Inject |
    public HomeController(/*@Named|*/ @Qualifier("authUserService") Service service) {
        this.service = service;
    }
}
