package com.nbcb.design.iterator.iterator;

public class MenuItem {
    private String name;
    private String description;
    private int price;
    private boolean vegeteration;


    public MenuItem(String name, String description, int price, boolean vegeteration) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegeteration = vegeteration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVegeteration() {
        return vegeteration;
    }

    public void setVegeteration(boolean vegeteration) {
        this.vegeteration = vegeteration;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vegeteration=" + vegeteration +
                '}';
    }
}
