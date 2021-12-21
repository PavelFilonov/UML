package atos.city.buildings;

import atos.city.employees.Employee;

import java.util.HashSet;
import java.util.Set;

public class Hospital extends Building {

    private Employee headDoctor;
    private Set<Employee> doctors;

    public Hospital(int price, int square, Employee headDoctor) {
        super(price, square);
        this.headDoctor = headDoctor;
        doctors = new HashSet<>();
    }

    public void heal() {
        System.out.println("Лечить");
    }

    public void setHeadDoctor(Employee headDoctor) {
        this.headDoctor = headDoctor;
    }

    public boolean addDoctor(Employee doctor) {
        return doctors.add(doctor);
    }

    public boolean removeDoctor(Employee doctor) {
        return doctors.remove(doctor);
    }
}
