package com.recbill.model;

public class Invoice {

    private int invoiceID;

    private int buyerID;
    private int sellerID;
    private int agentID;
    private int itemID;

    private Buyer buyer;
    private Seller seller;
    private Agent agent;
    private Item item;
    private double invoiceTotalAmount;

    public Invoice(int invoiceID, Buyer buyer, Seller seller, Agent agent, Item item,
                   double invoiceTotalAmount) {
        this.invoiceID = invoiceID;
        this.buyer = buyer;
        this.seller = seller;
        this.agent = agent;
        this.item = item;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    public Invoice(Buyer buyer, Seller seller, Agent agent, Item item,
                   double invoiceTotalAmount) {
        this.buyer = buyer;
        this.seller = seller;
        this.agent = agent;
        this.item = item;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    public Invoice(int invoiceID, int buyerID, int sellerID, int agentID, int itemID,
                   double invoiceTotalAmount) {
        this.invoiceID = invoiceID;
        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.agentID = agentID;
        this.itemID = itemID;
        this.invoiceTotalAmount = invoiceTotalAmount;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
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
