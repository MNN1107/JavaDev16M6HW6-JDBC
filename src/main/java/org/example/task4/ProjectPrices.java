package org.example.task4;

public class ProjectPrices {
    private String name;
    private int price;

    public ProjectPrices(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
