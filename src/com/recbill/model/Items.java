package com.recbill.model;

public class Items {

    private int itemID;
    private String itemCode;
    private String itemName;
    private String itemType;
    private String itemUnits;
    private double itemQuantity;
    private double itemPrice;
    private double itemAmount;

    public Items(int itemID, String itemCode, String itemName, String itemType, String itemUnits,
                 double itemQuantity, double itemPrice, double itemAmount) {
        this.itemID = itemID;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemUnits = itemUnits;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.itemAmount = itemAmount;
    }

    public Items(String itemCode, String itemName, String itemType, String itemUnits,
                 double itemQuantity, double itemPrice, double itemAmount) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemUnits = itemUnits;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.itemAmount = itemAmount;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(String itemUnits) {
        this.itemUnits = itemUnits;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemID=" + itemID +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemUnits='" + itemUnits + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                ", itemAmount=" + itemAmount +
                '}';
    }
}
