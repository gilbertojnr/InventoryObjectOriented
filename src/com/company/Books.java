package com.company;

/**
 * Created by gilbertakpan on 11/22/16.
 */
public class Books extends Inventory {
    public Books(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Books";

    }
}