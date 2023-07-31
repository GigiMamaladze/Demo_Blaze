package com.solvd.carina.demo.components.enums;

public enum Category {

    PHONES("Phones"),
    LAPTOPS("Laptops"),
    MONITORS("Monitors");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
