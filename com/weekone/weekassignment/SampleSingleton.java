package com.weekone.weekassignment;

import com.weekone.assignment4.Singleton;

import java.math.BigDecimal;
import java.sql.*;

public class SampleSingleton {

    private static Connection conn = null;
    private static SampleSingleton instance = null;

    public static SampleSingleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }
    public static void databaseQuery(BigDecimal input) throws SQLException {
        conn = DriverManager.getConnection("url of database");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id from table");
        BigDecimal x;
        while(rs.next()) x = input.multiply(BigDecimal.valueOf(rs.getInt(1)));
    }

    private SampleSingleton(){

    }
}
