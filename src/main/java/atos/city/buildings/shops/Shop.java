package atos.city.buildings.shops;

import atos.city.buildings.Building;

public abstract class Shop extends Building {

    private String name;

    public Shop(int price, int square, String name) {
        super(price, square);
        this.name = name;
    }

    public void buy() {
        System.out.println("Покупать что-то");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
