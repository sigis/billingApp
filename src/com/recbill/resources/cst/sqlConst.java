package com.recbill.resources.cst;

/**
 * Non-extenable final class for constant variables
 */
public final class sqlConst {

    // Hide constructor
    private sqlConst() {
    }

    // ---> SELECTIONS
    public static final String SELECT_INVOICES = "SELECT * FROM invoices";
    public static final String SELECT_ITEMS = "SELECT * FROM items";
}
