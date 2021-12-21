package atos.city.buildings.factories;

public class MetallurgicalFactory extends Factory {

    public MetallurgicalFactory(String name) {
        super(name);
    }

    @Override
    public void produce() {
        System.out.println("Производить металл");
    }
}
