package atos.city.employees;

public class Doctor extends Employee {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Лечить людей");
    }
}
