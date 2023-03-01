package dev.jlkeesh.springframeworkcore.config;

import dev.jlkeesh.springframeworkcore.beans.MyBean;
import dev.jlkeesh.springframeworkcore.beans.MyBean2;
import org.springframework.context.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;

@Configuration
@Import(MYConfig.class)
/*
@PropertySource("classpath:application.properties")
*/
@ImportResource("classpath:ioc-settings.xml")
@ComponentScan("dev.jlkeesh.springframeworkcore")
public class MYConfig2 {
}
