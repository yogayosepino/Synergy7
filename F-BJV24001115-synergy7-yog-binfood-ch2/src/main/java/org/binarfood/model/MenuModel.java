package org.binarfood.model;

import lombok.*;

@Setter
@Getter
public class MenuModel {
    private String name;
    private long price;
    private MenuType menuType;


    public enum MenuType{
        FOOD, DRINKS
    }

    public MenuModel(String name, long price, MenuType menuType){
        this.name = name;
        this.price = price;
        this.menuType = menuType;
    }
}
