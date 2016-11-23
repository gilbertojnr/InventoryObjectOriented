package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Inventory> items = new ArrayList<>();

    public static Inventory createItem(String name, int quantity, String category) {

        if (category.equalsIgnoreCase("Books")) {
            Books b = new Books(name, quantity);
            return b;
        } else if (category.equalsIgnoreCase("Tools")) {
            Tools t = new Tools(name, quantity);
            return t;
        } else if (category.equalsIgnoreCase("Art")) {
            Art a = new Art(name, quantity);
            return a;
        } else if (category.equalsIgnoreCase("Food")) {
            Food f = new Food(name, quantity);
            return f;
        } else if (category.equalsIgnoreCase("Shirts")) {
            Shirts s = new Shirts(name, quantity);
            return s;
        }
        return null;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (Inventory item : items) {
                String checkbox = "[" + item.quantity + "]";

                System.out.printf("%d. %s %s %s\n", i, item.name, item.category, checkbox);

//                System.out.println(i + ". " + item.name + " " + checkbox);
                i++;
            }

            System.out.println("Options:");
            System.out.println("[1] Create new Item");
            System.out.println("[2] Remove an item from inventory");
            System.out.println("[3] Update item's quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter new item:");
                String name = scanner.nextLine();
                System.out.println("Enter quantity");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter category [Art/Books/Food/Shirts/Tools]");
                String category = scanner.nextLine();

                items.add(createItem(name, quantity, category));


            } else if (option.equals("2")) {
                System.out.println(" Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());
                items.remove(itemNum - 1);
                System.out.println("Item successfully removed!");

            } else if (option.equals("3")) {
                System.out.println(" Choose item you'd like to update");
                int itemNum = Integer.parseInt(scanner.nextLine());
                System.out.println(" What would you like to change the quantity to?");
                int number = Integer.parseInt(scanner.nextLine());

                Inventory item = items.get(itemNum - 1);
                item.quantity = number;

            }
        }

    }
}
