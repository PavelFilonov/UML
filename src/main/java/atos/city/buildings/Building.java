package atos.city.buildings;

public abstract class Building {

    private int price;
    private int square;

    public Building(int price, int square) {
        this.price = price;
        this.square = square;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
