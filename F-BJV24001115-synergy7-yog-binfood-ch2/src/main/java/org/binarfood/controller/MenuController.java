package org.binarfood.controller;

import java.util.*;

import org.binarfood.model.MenuModel;
import org.binarfood.model.OrderModel;

public class MenuController {
    private static final ArrayList<MenuModel> menuModels = new ArrayList<>();
    private static final ArrayList<OrderModel> orderModels = new ArrayList<>();

    public static void displayMenu(){
        menuModels.add(new MenuModel("Nasi Goreng", 15000, MenuModel.MenuType.FOOD));
        menuModels.add(new MenuModel("Mie Goreng", 13000, MenuModel.MenuType.FOOD));
        menuModels.add(new MenuModel("Nasi + Ayam", 18000, MenuModel.MenuType.FOOD));
        menuModels.add(new MenuModel("Es Teh Manis", 3000, MenuModel.MenuType.DRINKS));
        menuModels.add(new MenuModel("Es Jeruk", 5000, MenuModel.MenuType.DRINKS));
    }
}
