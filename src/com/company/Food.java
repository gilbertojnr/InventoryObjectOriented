package com.company;

/**
 * Created by gilbertakpan on 11/22/16.
 */
public class Food extends Inventory{
    public Food(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.category = "Food";
    }
}
