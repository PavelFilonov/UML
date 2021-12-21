package atos.city.buildings;

public class ResidentialQuarter extends Building {

    private int populationDensity;

    public ResidentialQuarter(int price, int square, int populationDensity) {
        super(price, square);
        this.populationDensity = populationDensity;
    }

    public int getPopulationDensity() {
        return populationDensity;
    }

    public void setPopulationDensity(int populationDensity) {
        this.populationDensity = populationDensity;
    }
}
