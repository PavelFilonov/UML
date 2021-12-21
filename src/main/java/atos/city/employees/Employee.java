package atos.city.employees;

public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Работать");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
