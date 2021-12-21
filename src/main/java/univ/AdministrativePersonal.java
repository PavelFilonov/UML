package univ;

public class AdministrativePersonal extends Employee {

    public AdministrativePersonal(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    public void editDoc() {
        System.out.println("Editing a document...");
    }
}
