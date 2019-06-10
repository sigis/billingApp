package com.recbill.model;

public class Buyer {

    String buyerName, buyerSurname, buyerCompanyName;

    String buyerAddress;
    String buyerPhone;

    String buyerCode;
    String buyerVAT;

    String buyerBank;
    String buyerIBAN;

    public Buyer(String buyerName, String buyerSurname, String buyerAddress,
                 String buyerPhone, String buyerCode, String buyerVAT,
                 String buyerBank, String buyerIBAN) {
        this.buyerName = buyerName;
        this.buyerSurname = buyerSurname;
        this.buyerAddress = buyerAddress;
        this.buyerPhone = buyerPhone;
        this.buyerCode = buyerCode;
        this.buyerVAT = buyerVAT;
        this.buyerBank = buyerBank;
        this.buyerIBAN = buyerIBAN;
    }

    public Buyer(String buyerCompanyName, String buyerAddress, String buyerPhone,
                 String buyerCode, String buyerVAT,
                 String buyerBank, String buyerIBAN) {
        this.buyerCompanyName = buyerCompanyName;
        this.buyerAddress = buyerAddress;
        this.buyerPhone = buyerPhone;
        this.buyerCode = buyerCode;
        this.buyerVAT = buyerVAT;
        this.buyerBank = buyerBank;
        this.buyerIBAN = buyerIBAN;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerSurname() {
        return buyerSurname;
    }

    public void setBuyerSurname(String buyerSurname) {
        this.buyerSurname = buyerSurname;
    }

    public String getBuyerCompanyName() {
        return buyerCompanyName;
    }

    public void setBuyerCompanyName(String buyerCompanyName) {
        this.buyerCompanyName = buyerCompanyName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public String getBuyerVAT() {
        return buyerVAT;
    }

    public void setBuyerVAT(String buyerVAT) {
        this.buyerVAT = buyerVAT;
    }

    public String getBuyerBank() {
        return buyerBank;
    }

    public void setBuyerBank(String buyerBank) {
        this.buyerBank = buyerBank;
    }

    public String getBuyerIBAN() {
        return buyerIBAN;
    }

    public void setBuyerIBAN(String buyerIBAN) {
        this.buyerIBAN = buyerIBAN;
    }
}
