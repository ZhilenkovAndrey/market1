package com.geekbrains.market;


public class Product {
    private int id;
    private String title;
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Product(int id, String title,double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product: " + id + ". " + title +
                " cost= " + cost;
    }
}
