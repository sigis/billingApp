package com.recbill.model;

public class Seller {

    private int sellerID;
    private String sellerName, sellerSurname, sellerCompanyName;

    private String sellerAddress;
    private String sellerPhone;

    private String sellerCode;
    private String sellerVAT;

    private String sellerBank;
    private String sellerIBAN;

    public Seller(int sellerID, String sellerCompanyName, String sellerAddress) {
        this.sellerID = sellerID;
        this.sellerCompanyName = sellerCompanyName;
        this.sellerAddress = sellerAddress;
    }

    public Seller(int sellerID, String sellerName, String sellerSurname,
                  String sellerAddress, String sellerPhone, String sellerCode,
                  String sellerVAT, String sellerBank, String sellerIBAN) {
        this.sellerID = sellerID;
        this.sellerName = sellerName;
        this.sellerSurname = sellerSurname;
        this.sellerAddress = sellerAddress;
        this.sellerPhone = sellerPhone;
        this.sellerCode = sellerCode;
        this.sellerVAT = sellerVAT;
        this.sellerBank = sellerBank;
        this.sellerIBAN = sellerIBAN;
    }

    public Seller(String sellerName, String sellerSurname, String sellerAddress,
                  String sellerPhone, String sellerCode, String sellerVAT,
                  String sellerBank, String sellerIBAN) {
        this.sellerName = sellerName;
        this.sellerSurname = sellerSurname;
        this.sellerAddress = sellerAddress;
        this.sellerPhone = sellerPhone;
        this.sellerCode = sellerCode;
        this.sellerVAT = sellerVAT;
        this.sellerBank = sellerBank;
        this.sellerIBAN = sellerIBAN;
    }

    public Seller(int sellerID, String sellerCompanyName, String sellerAddress, String sellerPhone,
                  String sellerCode, String sellerVAT, String sellerBank, String sellerIBAN) {
        this.sellerID = sellerID;
        this.sellerCompanyName = sellerCompanyName;
        this.sellerAddress = sellerAddress;
        this.sellerPhone = sellerPhone;
        this.sellerCode = sellerCode;
        this.sellerVAT = sellerVAT;
        this.sellerBank = sellerBank;
        this.sellerIBAN = sellerIBAN;
    }

    public Seller(String sellerCompanyName, String sellerAddress, String sellerPhone,
                  String sellerCode, String sellerVAT,
                  String sellerBank, String sellerIBAN) {
        this.sellerCompanyName = sellerCompanyName;
        this.sellerAddress = sellerAddress;
        this.sellerPhone = sellerPhone;
        this.sellerCode = sellerCode;
        this.sellerVAT = sellerVAT;
        this.sellerBank = sellerBank;
        this.sellerIBAN = sellerIBAN;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerSurname() {
        return sellerSurname;
    }

    public void setSellerSurname(String sellerSurname) {
        this.sellerSurname = sellerSurname;
    }

    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getSellerVAT() {
        return sellerVAT;
    }

    public void setSellerVAT(String sellerVAT) {
        this.sellerVAT = sellerVAT;
    }

    public String getSellerBank() {
        return sellerBank;
    }

    public void setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
    }

    public String getSellerIBAN() {
        return sellerIBAN;
    }

    public void setSellerIBAN(String sellerIBAN) {
        this.sellerIBAN = sellerIBAN;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerID=" + sellerID +
                ", sellerName='" + sellerName + '\'' +
                ", sellerSurname='" + sellerSurname + '\'' +
                ", sellerCompanyName='" + sellerCompanyName + '\'' +
                ", sellerAddress='" + sellerAddress + '\'' +
                ", sellerPhone='" + sellerPhone + '\'' +
                ", sellerCode='" + sellerCode + '\'' +
                ", sellerVAT='" + sellerVAT + '\'' +
                ", sellerBank='" + sellerBank + '\'' +
                ", sellerIBAN='" + sellerIBAN + '\'' +
                '}';
    }
}
