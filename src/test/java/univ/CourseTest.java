package univ;

import org.junit.jupiter.api.Test;
import univ.Course;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private Course course = new Course(1, "Java development", 100);

    @Test
    void getName() {
        assertEquals("Java development", course.getName());
    }

    @Test
    void getId() {
        assertEquals(1, course.getId());
    }

    @Test
    void getHours() {
        assertEquals(100, course.getHours());
    }
}
