package univ;

import org.junit.jupiter.api.Test;
import univ.Dean;
import univ.Faculty;
import univ.University;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    private University university = new University("ВГУ");

    @Test
    void getName() {
        assertEquals("ВГУ", university.getName());
    }

    @Test
    void addEmployee() {
        assertEquals(0, university.getEmployees().size());

        university.addEmployee(new Dean(
                1,
                "Крыловецкий Александр Абрамович",
                "aakryl@sc.vsu.ru"
        ));

        assertEquals(1, university.getEmployees().size());
        assertEquals(1, university.getEmployees().get(0).getSocialSecurityNumber());
        assertEquals("Крыловецкий Александр Абрамович", university.getEmployees().get(0).getName());
        assertEquals("aakryl@sc.vsu.ru", university.getEmployees().get(0).getEmail());
    }

    @Test
    void removeEmployeeBySocialSecurityNumber() {
        university.addEmployee(new Dean(
                1,
                "Крыловецкий Александр Абрамович",
                "aakryl@sc.vsu.ru"
        ));

        assertEquals(1, university.getEmployees().size());

        university.removeEmployeeBySocialSecurityNumber(1);

        assertEquals(0, university.getEmployees().size());
    }

    @Test
    void addFaculty() {
        assertEquals(0, university.getFaculties().size());

        university.addFaculty(new Faculty("ФКН"));

        assertEquals(1, university.getFaculties().size());
        assertEquals("ФКН", university.getFaculties().get(0).getName());
    }

    @Test
    void removeFacultyByName() {
        university.addFaculty(new Faculty("ФКН"));

        assertEquals(1, university.getFaculties().size());

        university.removeFacultyByName("ФКН");

        assertEquals(0, university.getFaculties().size());
    }
}