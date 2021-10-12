package com.rental.da4a;

public class Lot {

    private int id;
    private String name;
    private String price;
    private String description;
    private int users_id;

    public Lot(String name, String prise, String description){
        this.name = name;
        this.price = prise;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getUsers_id() {
        return users_id;
    }
}
