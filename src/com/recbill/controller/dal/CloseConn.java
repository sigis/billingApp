package com.recbill.controller.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CloseConn {

    public static void  closeConn(Connection conn, Statement stmt, ResultSet rs) {

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
