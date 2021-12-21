package atos.city.buildings;

import atos.city.buildings.shops.Shop;

import java.util.Set;

public class CommercialQuarter extends Building {

    private Set<Shop> shops;
    private Set<ShoppingCentre> shoppingCentres;

    public CommercialQuarter(int price, int square) {
        super(price, square);
    }

    public boolean addShop(Shop shop) {
        return shops.add(shop);
    }

    public boolean removeShop(Shop shop) {
        return shops.remove(shop);
    }

    public boolean addShoppingCentre(ShoppingCentre shoppingCentre) {
        return shoppingCentres.add(shoppingCentre);
    }

    public boolean removeShoppingCentre(ShoppingCentre shoppingCentre) {
        return shoppingCentres.remove(shoppingCentre);
    }
}
