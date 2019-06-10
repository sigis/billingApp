package com.recbill.model;

public class Invoice {

    private int invoiceID;
    Buyer buyer;
    Seller seller;
    Agent agent;
    Items item;
    private double invoiceTotalAmount;

    public Invoice(int invoiceID, Buyer buyer, Seller seller, Agent agent, Items item,
                   double invoiceTotalAmount) {
        this.invoiceID = invoiceID;
        this.buyer = buyer;
        this.seller = seller;
        this.agent = agent;
        this.item = item;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    public Invoice(Buyer buyer, Seller seller, Agent agent, Items item,
                   double invoiceTotalAmount) {
        this.buyer = buyer;
        this.seller = seller;
        this.agent = agent;
        this.item = item;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public double getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    public void setInvoiceTotalAmount(double invoiceTotalAmount) {
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", buyer=" + buyer +
                ", seller=" + seller +
                ", agent=" + agent +
                ", item=" + item +
                ", invoiceTotalAmount=" + invoiceTotalAmount +
                '}';
    }
}
