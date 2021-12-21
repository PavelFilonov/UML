package atos.city.buildings;

import univ.Employee;

import java.util.Set;

public class PoliceDepartment extends Building {

    private Set<Employee> policemen;

    public PoliceDepartment(int price, int square) {
        super(price, square);
    }

    public boolean addPoliceman(Employee policeman) {
        return policemen.add(policeman);
    }

    public boolean removePoliceman(Employee policeman) {
        return policemen.remove(policeman);
    }
}
