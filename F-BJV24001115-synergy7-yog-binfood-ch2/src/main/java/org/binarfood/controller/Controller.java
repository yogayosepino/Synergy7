package org.binarfood.controller;
import org.binarfood.model.Model;
import org.binarfood.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Model> menu;
    private List<Model> order;
    private View view;

    public Controller() {
        menu = new ArrayList<>();
        order = new ArrayList<>();
        view = new View();
    }

    public void setMenu(List<Model> menu) {
        this.menu = menu;
    }

    public void displayMenu() {
        view.displayMenu(menu);
    }

    public void selectItem(int index) {
        if (index >= 0 && index < menu.size()) {
            Model selectedItem = menu.get(index);
            order.add(selectedItem);
            view.displaySelection(selectedItem);
        } else {
            System.out.println("Invalid selection");
        }
    }

    public void displayReceipt() {
        view.displayReceipt(order);
    }
}


