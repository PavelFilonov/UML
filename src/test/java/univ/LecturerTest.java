package univ;

import org.junit.jupiter.api.Test;
import univ.Lecturer;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    private Lecturer lecturer = new Lecturer(
            1,
            "Филонов Павел Олегович",
            "filonov@cs.vsu.ru"
    );

    @Test
    void getSocialSecurityNumber() {
        assertEquals(1, lecturer.getSocialSecurityNumber());
    }

    @Test
    void getName() {
        assertEquals("Филонов Павел Олегович", lecturer.getName());
    }

    @Test
    void getEmail() {
        assertEquals("filonov@cs.vsu.ru", lecturer.getEmail());
    }
}