package atos.city.buildings.factories;

public abstract class Factory {

    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public void produce() {
        System.out.println("Производить что-то");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
