package com.mathsquiz;

public class Calculation {
    private String operation;
    private double operand1, operand2, result;

    public Calculation(String operation, double operand1, double operand2, double result) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    public String getOperation() { return operation; }
    public double getOperand1() { return operand1; }
    public double getOperand2() { return operand2; }
    public double getResult() { return result; }
}
