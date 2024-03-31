package org.binarfood;

import org.binarfood.controller.Controller;
import org.binarfood.model.Model;
import org.binarfood.view.View;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Sample food items
        Model item1 = new Model("Burger", 5.99);
        Model item2 = new Model("Pizza", 8.99);
        Model item3 = new Model("Salad", 4.99);
        Model item4 = new Model("Salad", 4.99);
        Model item5 = new Model("Salad", 4.99);

        List<Model> menu = Arrays.asList(item1, item2, item3);

        // MVC components
        View view = new View();
        Controller controller = new Controller();
        controller.setMenu(menu);
        controller.displayMenu();

        // Simulate user interaction
        int selectedItemIndex = view.selectItem();
        controller.selectItem(selectedItemIndex);

        // Display receipt
        controller.displayReceipt();
    }
}

