package univ;

import org.junit.jupiter.api.Test;
import univ.Participation;
import univ.Project;
import univ.ResearchAssociate;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ParticipationTest {

    private ResearchAssociate researchAssociate = new ResearchAssociate(
            1,
            "Филонов Павел Олегович",
            "filonov@cs.vsu.ru"
    );

    private Project project = new Project(
            "Lab11",
            new Date(2021, Calendar.DECEMBER, 11),
            new Date(2021, Calendar.DECEMBER, 12)
    );

    private Participation participation = new Participation(
            50,
            researchAssociate,
            project
    );

    @Test
    void getHours() {
        assertEquals(50, participation.getHours());
    }

    @Test
    void getResearchAssociate() {
        assertEquals(researchAssociate, participation.getResearchAssociate());
    }

    @Test
    void getProject() {
        assertEquals(project, participation.getProject());
    }
}