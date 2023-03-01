package dev.jlkeesh.springframeworkcore.config;

import dev.jlkeesh.springframeworkcore.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MYConfig {

    @Autowired
    Environment env;

    @Bean(name = "myBean",
            initMethod = "init",
            destroyMethod = "destroy"
    )
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyBean2 myBean2() {
        MyBean2 myBean2 = new MyBean2();
        myBean2.setMyBean(myBean());
        return myBean2;
    }

    @Bean(initMethod = "initializeData")
    @Conditional(SeederCondition.class)
    public Seeder seeder() {
        return new Seeder();
    }

    /*@Bean
    public BaseDAO baseDAO() {
        return new BaseDAO(
                env.getProperty("spring.datasource.url"),
                env.getProperty("spring.datasource.user"),
                env.getProperty("spring.datasource.password"),
                env.getProperty("spring.datasource.database"),
                env.getProperty("spring.datasource.schema"),
                env.getProperty("spring.datasource.driver")
        );
    }*/
    @Bean
    public BaseDAO baseDAO() {
        return new BaseDAO();
    }
}
