package univ;

public class ResearchAssociate extends Employee {

    public ResearchAssociate(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    public void releaseScientificWork() {
        System.out.println("Releasing a scientific work...");
    }
}

