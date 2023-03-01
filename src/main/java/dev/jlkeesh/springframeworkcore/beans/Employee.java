package dev.jlkeesh.springframeworkcore.beans;

public class Employee {


    public static Employee getInstance() {
        System.out.println("Factory Method");
        return new Employee();
    }

    private void init() {
        System.out.println("Init Method Called");
    }

    private void destroy() {
        System.out.println("Destroy Method Called");
    }
}
