package dev.jlkeesh.springframeworkcore.beans;

import org.springframework.stereotype.Component;

@Component
public record MyBean2(MyBean myBean) {

    public void timeIs2(){
        myBean.timeIs();
    }
}
