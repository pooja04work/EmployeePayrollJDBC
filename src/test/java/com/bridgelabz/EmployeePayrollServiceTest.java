package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollServiceTest {
    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() throws EmployeePayrollException, SQLException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        List<EmployeePayrollData> employeePayrollData = employeePayrollServiceImplementation.getEmployees();
        System.out.println(employeePayrollData);
        Assert.assertEquals(7,employeePayrollData.size());
    }
//    @Test
//    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatch() throws EmployeePayrollException {
//        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
//        int employeePayrollData = employeePayrollServiceImplementation.getEmployeePayrollData("Roni",32000);
//        Assert.assertEquals(1,employeePayrollData);
//    }
//    @Test
//    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatchUsingPreparedStatement() throws EmployeePayrollException {
//        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
//        int employeePayrollData = employeePayrollServiceImplementation.preparedStatmentForWholeTableData("Roni",10);
//        Assert.assertEquals(1,employeePayrollData);
//    }
//    @Test
//    public void givenNameForEmployee_WhenRetrieved_ShouldMatchEmployeeCount() throws EmployeePayrollException {
//        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
//        List<EmployeePayrollData> employeePayrollData = employeePayrollServiceImplementation.preparedStatmentForWholeTableData("Kitti");
//        System.out.println(employeePayrollData);
//        Assert.assertEquals(1,employeePayrollData.size());
//    }
}