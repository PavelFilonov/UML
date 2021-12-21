package univ;

import org.junit.jupiter.api.Test;
import univ.ResearchAssociate;

import static org.junit.jupiter.api.Assertions.*;

class ResearchAssociateTest {

    private ResearchAssociate researchAssociate = new ResearchAssociate(
            1,
            "Филонов Павел Олегович",
            "filonov@cs.vsu.ru"
    );

    @Test
    void getSocialSecurityNumber() {
        assertEquals(1, researchAssociate.getSocialSecurityNumber());
    }

    @Test
    void getName() {
        assertEquals("Филонов Павел Олегович", researchAssociate.getName());
    }

    @Test
    void getEmail() {
        assertEquals("filonov@cs.vsu.ru", researchAssociate.getEmail());
    }
}