package com.recbill.resources.cst;

public final class tableCST {

    private tableCST() {
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
}
