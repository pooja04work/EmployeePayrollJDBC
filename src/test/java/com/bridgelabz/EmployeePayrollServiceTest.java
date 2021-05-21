package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeePayrollServiceTest {
    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() throws EmployeePayrollException, SQLException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        List<EmployeePayrollData> employeePayrollData = employeePayrollServiceImplementation.getEmployees();
        System.out.println(employeePayrollData);
        Assert.assertEquals(7, employeePayrollData.size());
    }

    @Test
    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatch() throws EmployeePayrollException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        int employeePayrollData = employeePayrollServiceImplementation.getEmployeePayrollData("Roni", 32000);
        Assert.assertEquals(1, employeePayrollData);
    }

    @Test
    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatchUsingPreparedStatement() throws EmployeePayrollException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        int employeePayrollData = employeePayrollServiceImplementation.preparedStatmentForWholeTableData("Roni", 10);
        Assert.assertEquals(1, employeePayrollData);
    }

    @Test
    public void givenNameForEmployee_WhenRetrieved_ShouldMatchEmployeeCount() throws EmployeePayrollException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        List<EmployeePayrollData> employeePayrollData = employeePayrollServiceImplementation.preparedStatmentForWholeTableData("Kitti");
        System.out.println(employeePayrollData);
        Assert.assertEquals(1, employeePayrollData.size());
    }

    @Test
    public void givenDataRangeWeShouldBeAbleToFindAllTheEmployessJoined() throws EmployeePayrollException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        ArrayList<EmployeePayrollData> employesJoinesForDateRange = employeePayrollServiceImplementation.findEmployesJoinesForDateRange("2018-11-09", "2020-01-10");
        System.out.println(employesJoinesForDateRange);
        Assert.assertEquals(3, employesJoinesForDateRange.size());
    }

    @Test
    public void givenEmployeePayrollInDB_WhenRetrievedForSum_ShouldMatchedSumSalaryForGender() throws EmployeePayrollException {
        EmployeePayrollServiceImplementation employeePayrollServiceImplementation = new EmployeePayrollServiceImplementation();
        Assert.assertEquals(410000, employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("sum"));
        Assert.assertEquals(68333, employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("avg"), 0.0);
        Assert.assertEquals(90000, employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("max"), 0.0);
        Assert.assertEquals(30000, employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("min"), 0.0);
        System.out.println("Sum: " + employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("sum"));
        System.out.println("Avg: " + employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("avg"));
        System.out.println("Max: " + employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("max"));
        System.out.println("Min: " + employeePayrollServiceImplementation.performOperationOnSalaryOfEmployees("min"));

    }
}