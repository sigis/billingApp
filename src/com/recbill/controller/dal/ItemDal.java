package com.recbill.controller.dal;

import com.recbill.model.Item;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.recbill.controller.dal.CloseConn.closeConn;
import static com.recbill.resources.cst.sqlConst.SELECT_ITEMS;

public class ItemDal {

    private DataSource dataSource;

    public ItemDal(DataSource ds) {
        dataSource = ds;
    } // ds - is a parameter being passed into this constructor

    public List<Item> getItems() throws SQLException {
        List<Item> items = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // get a connection
            String sql = SELECT_ITEMS;
            conn = dataSource.getConnection();

            // create statement
            stmt = conn.createStatement();

            // execute query
            rs = stmt.executeQuery(sql);

            // proccess result set
            while (rs.next()) {
                int itID = rs.getInt("item_id");
                String itemName = rs.getString("item_name");
                double itemPrice = rs.getDouble("item_price");

                // create new Item object
                Item item = new Item(itID, itemName, itemPrice);

                // add item to Items Array List
                items.add(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConn(conn, stmt, rs);
        }

        return items;
    }

}
