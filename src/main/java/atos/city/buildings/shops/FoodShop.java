package atos.city.buildings.shops;

public class FoodShop extends Shop {

    public FoodShop(int price, int square, String name) {
        super(price, square, name);
    }

    @Override
    public void buy() {
        System.out.println("Покупать еду");
    }
}
