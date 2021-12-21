package univ;

import org.junit.jupiter.api.Test;
import univ.Dean;
import univ.Employee;

import static org.junit.jupiter.api.Assertions.*;

class DeanTest {

    private Employee dean = new Dean(
            1,
            "Крыловецкий Александр Абрамович",
            "aakryl@sc.vsu.ru"
    );

    @Test
    void getSocialSecurityNumber() {
        assertEquals(1, dean.getSocialSecurityNumber());
    }

    @Test
    void getName() {
        assertEquals("Крыловецкий Александр Абрамович", dean.getName());
    }

    @Test
    void getEmail() {
        assertEquals("aakryl@sc.vsu.ru", dean.getEmail());
    }
}