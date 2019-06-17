package com.recbill.model;

public class Item {

    private int itemID;
    private String itemName;
    private double itemPrice;

    public Item(int itemID, String itemName, double itemPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
