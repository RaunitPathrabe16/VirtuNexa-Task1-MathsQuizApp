package com.mathsquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {

    public static List<String> getHistory() {
        List<String> history = new ArrayList<>();
        String sql = "SELECT operation, operand1, operand2, result FROM calculations ORDER BY id DESC";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String record = rs.getString("operation") + ": " +
                                rs.getDouble("operand1") + " & " +
                                rs.getDouble("operand2") + " = " +
                                rs.getDouble("result");
                history.add(record);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving history: " + e.getMessage());
        }

        return history;
    }
}


