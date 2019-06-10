package com.recbill.model;

public class Invoice {

    Buyer buyer;
    Seller seller;
    Agent agent;
    Items item;
    double invoiceTotalAmount;

    public Invoice(Buyer buyer, Seller seller, Agent agent, Items item, double invoiceTotalAmount) {
        this.buyer = buyer;
        this.seller = seller;
        this.agent = agent;
        this.item = item;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }
}
