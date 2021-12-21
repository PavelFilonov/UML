package univ;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Employee> employees = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployeeBySocialSecurityNumber(int socialSecurityNumber) {
        for (Employee employee: employees) {
            if (employee.getSocialSecurityNumber() == socialSecurityNumber) {
                employees.remove(employee);
                break;
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFacultyByName(String name) {
        for (Faculty faculty: faculties) {
            if (faculty.getName().equals(name)) {
                faculties.remove(faculty);
                break;
            }
        }
    }

    public List<Employee> getEmployees() {
        return List.copyOf(employees);
    }

    public List<Faculty> getFaculties() {
        return List.copyOf(faculties);
    }

    @Override
    public String toString() {
        return "univ.University{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", faculties=" + faculties +
                '}';
    }
}
