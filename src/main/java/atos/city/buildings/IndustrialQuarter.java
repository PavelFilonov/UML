package atos.city.buildings;

import atos.city.buildings.factories.Factory;

import java.util.Set;

public class IndustrialQuarter extends Building {

    private Set<Factory> factories;

    public IndustrialQuarter(int price, int square) {
        super(price, square);
    }

    public boolean addFactory(Factory factory) {
        return factories.add(factory);
    }

    public boolean removeFactory(Factory factory) {
        return factories.remove(factory);
    }
}
