package com.bridgelabz;

public class EmployeePayrollException extends Exception{
    String  errorMessage;
    public EmployeePayrollException(String message, ExceptionType connectionFail) {
        this.errorMessage = message;
    }

    public EmployeePayrollException(String message)  {
        this.errorMessage = message;
    }

    public enum ExceptionType{CONNECTION_FAIL, SQL_ERROR, UPDATE_ERROR, INVALID_PAYROLL_DATA}
    ExceptionType type;
}
