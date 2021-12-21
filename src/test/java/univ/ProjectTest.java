package univ;

import univ.Project;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    private Project project = new Project(
            "Lab11",
            new Date(2021, Calendar.DECEMBER, 11),
            new Date(2021, Calendar.DECEMBER, 12)
    );

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Lab11", project.getName());
    }

    @org.junit.jupiter.api.Test
    void getStart() {
        assertEquals(new Date(2021, Calendar.DECEMBER, 11), project.getStart());
    }

    @org.junit.jupiter.api.Test
    void getEnd() {
        assertEquals(new Date(2021, Calendar.DECEMBER, 12), project.getEnd());
    }
}