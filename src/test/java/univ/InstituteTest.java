package univ;

import org.junit.jupiter.api.Test;
import univ.Institute;

import static org.junit.jupiter.api.Assertions.*;

class InstituteTest {

    private Institute institute = new Institute(
            "ПиИТ",
            "РФ, г. Воронеж, Университетская площадь, 1"
    );

    @Test
    void getName() {
        assertEquals("ПиИТ", institute.getName());
    }

    @Test
    void getAddress() {
        assertEquals("РФ, г. Воронеж, Университетская площадь, 1", institute.getAddress());
    }
}