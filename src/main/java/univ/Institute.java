package univ;

public class Institute {

    private String name;
    private String address;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "univ.Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
