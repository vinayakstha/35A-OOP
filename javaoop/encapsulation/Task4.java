package javaoop.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

class Menu {
    private String[] arr = { "momo", "pizza", "icecream" };
    private ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

    public void addItems(String item) {
        list.add(item);
    }

    public void removeItem(String item) {
        list.remove(item);
    }

    public ArrayList<String> getMenu() {
        return list;
    }
}

public class Task4 {
    /*
     * 4. You are developing a restaurant management system and want to create a
     * Menu class. The Menu class should encapsulate a list of MenuItem objects.
     * Implement the Menu class with private instance variables for the menu items
     * and provide public methods to add and remove items from the menu. Ensure that
     * the list of menu items cannot be directly accessed or modified from outside
     * the class.
     */
    public static void main(String[] args) {
        Menu m1 = new Menu();
        System.out.println(m1.getMenu());
        m1.removeItem("momo");
        System.out.println(m1.getMenu());
        m1.addItems("cold drinks");
        System.out.println(m1.getMenu());
    }
}
