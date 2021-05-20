package com.bridgelabz;
import java.sql.SQLException;
import java.util.List;

public interface EmployeePayrollService {
    public List<EmployeePayrollData> getEmployees()throws EmployeePayrollException, SQLException;
    int getEmployeePayrollData(String Name, int salary) throws EmployeePayrollException;
//    int preparedStatmentForWholeTableData(String Name, int salary) throws EmployeePayrollException;
}
