package univ;

public class Lecturer extends Employee {

    public Lecturer(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    public void giveLecture() {
        System.out.println("Giving a lecture...");
    }
}
