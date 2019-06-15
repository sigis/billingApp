package com.recbill.controller.dal;

import com.recbill.model.Item;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDal {

    private DataSource dataSource;

    public ItemDal(DataSource ds) {
        dataSource = ds; // ds - is a parameter being passed into this constructor
    }

    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        return items;
    }

}
