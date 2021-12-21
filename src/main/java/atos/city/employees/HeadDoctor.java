package atos.city.employees;

public class HeadDoctor extends Employee {

    public HeadDoctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Управлять больницей");
    }
}
