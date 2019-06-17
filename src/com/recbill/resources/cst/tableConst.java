package com.recbill.resources.cst;

public final class tableConst {

    // Hide constructor
    private tableConst() {
    }

    // ---> All Tables
    public static final int NO_ID = -1;

    /**
     * ---> TABLE Invoices
     */
    public static final String CREATE_TABLE_INVOICES = "CREATE TABLE IF NOT EXISTS invoices \n" +
            "(   invoice_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
            "    buyer_id INT (255),\n" +
            "    seller_id INT (255),\n" +
            "    agent_id INT (255),\n" +
            "    item_id INT (255),\n" +
            "    invoice_amount double\n" +
            ")";

    /**
     * ---> TABLE Items
     */
    public static final String CREATE_TABLE_ITEMS = "CREATE TABLE IF NOT EXISTS items \n" +
            "(   item_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
            "    item_name VARCHAR (255),\n" +
            "    item_price double\n" +
            ")";

    /**
     * ---> TABLE sellers
     */
    public static final String CREATE_TABLE_SELLER = "CREATE TABLE IF NOT EXISTS sellers \n" +
            "(   seller_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
            "    company_name VARCHAR(255),\n" +
            "    company_address VARCHAR(255)\n" +
            ")";

    /**
     * ---> TABLE buyers
     */
    public static final String CREATE_TABLE_BUYERS = "CREATE TABLE IF NOT EXISTS buyers\n" +
            "(   buyer_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
            "    buyer_name VARCHAR(255),\n" +
            "    buyer_address VARCHAR(255)\n" +
            ")";

}
