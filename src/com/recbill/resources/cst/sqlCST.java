package com.recbill.resources.cst;

/**
 * Non-extenable final class for constant variables
 */
public final class sqlCST {

    // Hide constructor
    private sqlCST() {
    }


    // ---> SELECTIONS
    public static final String SELECT_INVOICES = "SELECT * FROM invoices";
    public static final String SELECT_INVOICES_BY_DATE = "SELECT * FROM invoices ORDER BY invoice_date";
}
