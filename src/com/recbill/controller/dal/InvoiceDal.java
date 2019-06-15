package com.recbill.controller.dal;

import com.recbill.model.Invoice;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.recbill.resources.cst.sqlCST.SELECT_INVOICES_BY_DATE;

public class InvoiceDal {

    private DataSource dataSource;

    public InvoiceDal(DataSource ds) {
        dataSource = ds; // ds - is a parameter being passed into this constructor
    }
    
    public List<Invoice> getInvoices() throws Exception {
        List<Invoice> invoices = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // get connection
            conn = dataSource.getConnection();

            // create statemment
            String sql = SELECT_INVOICES_BY_DATE;
            stmt = conn.createStatement();

            // execute query
            rs = stmt.executeQuery(sql);

            // process result set
            while(rs.next()) {
                // retrieve data from result set row
                int invID = rs.getInt("invoice_id");
                int buyID = rs.getInt("buyer_id");
                int selID = rs.getInt("seller_id");
                int agID = rs.getInt("agent_ID");
                int itID = rs.getInt("item_id");
                double invAmt = rs.getDouble("invoice_amount");

                // create new invoice object
                Invoice invoice = new Invoice(invID, buyID, selID, agID, itID, invAmt);

                // add invoice to the list of invoices
                invoices.add(invoice);

            }

            // close JDBC connection
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, stmt, rs);
        }

        return invoices;
    }

    private void close(Connection conn, Statement stmt, ResultSet rs) {

        try {
            if(conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close(); // doesn't really close those ... just put back to the connections pool
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}