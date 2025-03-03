package com.mathsquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalculationLogger {
    public static void logCalculation(String operation, double operand1, double operand2, double result) {
        String sql = "INSERT INTO calculations (operation, operand1, operand2, result) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, operation);
            pstmt.setDouble(2, operand1);
            pstmt.setDouble(3, operand2);
            pstmt.setDouble(4, result);
            pstmt.executeUpdate();
            System.out.println("Calculation saved.");

        } catch (SQLException e) {
            System.out.println("Error saving calculation: " + e.getMessage());
        }
    }
}
