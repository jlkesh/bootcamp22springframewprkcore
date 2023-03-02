package dev.jlkeesh.springframeworkcore;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ToString
@PropertySource("classpath:application.properties")
public class SpelArithmeticOperators {

    @Value("#{12 + 89}")
    private int add;

    @Value("#{(4 + 5) * 3}")
    private int pm;

    @Value("#{12 ^ 2}")
    private int aa;
    @Value("${some.prop:3}")
    private int bo;

    @Value("#{2 > 3 ?'Two':'One'}")
    private String ternary;
    @Value("#{itClub.isMember('Elshod')?:'Not Member'}")
    private String isMember;


}
