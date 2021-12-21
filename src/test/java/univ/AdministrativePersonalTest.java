package univ;

import org.junit.jupiter.api.Test;
import univ.AdministrativePersonal;
import univ.Employee;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativePersonalTest {

    private Employee administrativePersonal = new AdministrativePersonal(
            1,
            "Филонов Павел Олегович",
            "filonov@cs.vsu.ru"
    );

    @Test
    void getSocialSecurityNumber() {
        assertEquals(1, administrativePersonal.getSocialSecurityNumber());
    }

    @Test
    void getName() {
        assertEquals("Филонов Павел Олегович", administrativePersonal.getName());
    }

    @Test
    void getEmail() {
        assertEquals("filonov@cs.vsu.ru", administrativePersonal.getEmail());
    }
}
