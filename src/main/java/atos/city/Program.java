package atos.city;

import atos.city.buildings.Hospital;
import atos.city.employees.Doctor;
import atos.city.employees.HeadDoctor;

public class Program {

    public static void main(String[] args) {
        Hospital hospital = new Hospital(
                1000,
                500,
                new HeadDoctor("Иванов Иван Иванович")
        );

        hospital.addDoctor(new Doctor("Петров Пётр Петрович"));
    }
}
