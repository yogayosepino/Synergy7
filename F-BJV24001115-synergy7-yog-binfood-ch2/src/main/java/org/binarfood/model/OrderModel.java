package org.binarfood.model;


import lombok.*;

@Getter
@Setter
public class OrderModel {
    private final MenuModel menuModel;
    private int qty;
    private long price;

    public OrderModel(MenuModel menuModel, long price, int qty){
        this.menuModel = menuModel;
        this.price = menuModel.getPrice();
        this.qty = qty;
    }

    public void addQty (int qty){
        this.qty += qty;
    }
}
