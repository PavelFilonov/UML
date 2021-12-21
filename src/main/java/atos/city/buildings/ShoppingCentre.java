package atos.city.buildings;

import atos.city.buildings.shops.Shop;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCentre extends Building {

    private Set<Shop> shops;
    private String name;

    public ShoppingCentre(int price, int square, String name) {
        super(price, square);
        shops = new HashSet<>();
        this.name = name;
    }

    public boolean addShop(Shop shop) {
        return shops.add(shop);
    }

    public boolean removeShop(Shop shop) {
        return shops.remove(shop);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
