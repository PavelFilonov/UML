package atos.city.employees;

public class Policeman extends Employee {

    public Policeman(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Ловить преступников");
    }
}
