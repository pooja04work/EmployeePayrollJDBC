package com.bridgelabz;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public interface EmployeePayrollService {
    public List<EmployeePayrollData> getEmployees()throws EmployeePayrollException, SQLException;
    int getEmployeePayrollData(String Name, int salary) throws EmployeePayrollException;
    int preparedStatmentForWholeTableData(String Name, int salary) throws EmployeePayrollException;
    List<EmployeePayrollData> preparedStatmentForWholeTableData(String name) throws EmployeePayrollException;
    public HashMap<String, Integer> performOperationsOnSalaryOf(String operation) throws EmployeePayrollException;
}
