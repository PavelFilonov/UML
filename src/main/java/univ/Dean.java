package univ;

public class Dean extends Employee {

    public Dean(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    public void sign() {
        System.out.println("Putting a signature...♠");
    }
}
