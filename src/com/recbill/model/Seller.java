package com.recbill.model;

public class Seller {

    String sellerName, sellerSurname, sellerCompanyName;

    String sellerAddress;
    String sellerPhone;

    String sellerCode;
    String sellerVAT;

    String sellerBank;
    String sellerIBAN;

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
}
