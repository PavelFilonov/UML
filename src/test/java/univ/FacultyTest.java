package univ;

import org.junit.jupiter.api.Test;
import univ.Faculty;
import univ.Institute;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    private Faculty faculty = new Faculty("ФКН");

    @Test
    void addInstitute() {
        assertEquals(0, faculty.getInstitutes().size());

        faculty.addInstitute(new Institute("ПиИТ", "РФ, г. Воронеж, Университетская площадь, 1"));

        assertEquals(1, faculty.getInstitutes().size());
        assertEquals("ПиИТ", faculty.getInstitutes().get(0).getName());
        assertEquals(
                "РФ, г. Воронеж, Университетская площадь, 1",
                faculty.getInstitutes().get(0).getAddress()
        );
    }

    @Test
    void removeInstituteByName() {
        faculty.addInstitute(new Institute("ПиИТ", "РФ, г. Воронеж, Университетская площадь, 1"));

        assertEquals(1, faculty.getInstitutes().size());

        faculty.removeInstituteByName("ПиИТ");

        assertEquals(0, faculty.getInstitutes().size());
    }

    @Test
    void getName() {
        assertEquals("ФКН", faculty.getName());
    }
}