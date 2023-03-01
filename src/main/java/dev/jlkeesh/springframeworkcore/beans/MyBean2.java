package dev.jlkeesh.springframeworkcore.beans;

public class MyBean2 {
    private MyBean myBean;

//    public MyBean2(MyBean myBean) { // CI
//        this.myBean = myBean;
//    }

    public void setMyBean(MyBean myBean) { // SI
        this.myBean = myBean;
    }

    public void hi2() {
        myBean.hi();
    }
}
