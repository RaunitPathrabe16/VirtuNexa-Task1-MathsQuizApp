package com.mathsquiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:calculator.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return conn;
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS calculations ("
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                   + "operation TEXT NOT NULL, "
                   + "operand1 REAL NOT NULL, "
                   + "operand2 REAL NOT NULL, "
                   + "result REAL NOT NULL"
                   + ");";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println("Table creation error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        createTable(); // Run this once to create the database and table
    }
}
