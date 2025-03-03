package com.mathsquiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    @FXML private TableView<Calculation> tableView;
    @FXML private TableColumn<Calculation, String> operationCol;
    @FXML private TableColumn<Calculation, Double> operand1Col;
    @FXML private TableColumn<Calculation, Double> operand2Col;
    @FXML private TableColumn<Calculation, Double> resultCol;

    private ObservableList<Calculation> calculations = FXCollections.observableArrayList();

    public void initialize() {
        operationCol.setCellValueFactory(new PropertyValueFactory<>("operation"));
        operand1Col.setCellValueFactory(new PropertyValueFactory<>("operand1"));
        operand2Col.setCellValueFactory(new PropertyValueFactory<>("operand2"));
        resultCol.setCellValueFactory(new PropertyValueFactory<>("result"));

        loadCalculations();
    }

    private void loadCalculations() {
        String sql = "SELECT * FROM calculations";
        try (Connection conn = DatabaseManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                calculations.add(new Calculation(
                        rs.getString("operation"),
                        rs.getDouble("operand1"),
                        rs.getDouble("operand2"),
                        rs.getDouble("result")
                ));
            }
            tableView.setItems(calculations);
        } catch (SQLException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public ObservableList<Calculation> getCalculations() {
        return calculations;
    }

    public void setCalculations(ObservableList<Calculation> calculations) {
        this.calculations = calculations;
    }
}

