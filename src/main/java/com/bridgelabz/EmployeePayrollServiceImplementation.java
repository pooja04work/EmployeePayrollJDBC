package com.bridgelabz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceImplementation implements EmployeePayrollService {
    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String userName = "root";
        String password = "root";
        Connection connection;
        System.out.println("Connecting to database:" + jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("Connection is successful...!!!!" + connection);
        return connection;
    }

    @Override
    public List<EmployeePayrollData> getEmployees() throws EmployeePayrollException, SQLException {
        String sql = "select * from employeepayroll;";
        List<EmployeePayrollData> employeePayrollData = new ArrayList<EmployeePayrollData>();
        try  {
            Connection connection = this.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            //System.out.println("result::::::::::::"+resultSet);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double salary = resultSet.getDouble(3);
                Date start = resultSet.getDate(4);
                String gender = resultSet.getString(5);
                employeePayrollData.add(new EmployeePayrollData(id, name, salary, start, gender));
            }
        } catch (SQLException e) {
            throw new EmployeePayrollException("Cannot establish connection",EmployeePayrollException.ExceptionType.CONNECTION_FAIL);
        }
        return employeePayrollData;
    }
//    @Override
//    public int getEmployeePayrollData(String Name, int salary) throws EmployeePayrollException {
//            String sql = String.format("update  employeepayroll set salary=%d where name='%s'", salary, Name);
//            try {
//                Connection connection = this.getConnection();
//                Statement statement = connection.createStatement();
//                return statement.executeUpdate(sql);
//            } catch (SQLException throwables) {
//                throw new EmployeePayrollException("Cannot establish connection",EmployeePayrollException.ExceptionType.CONNECTION_FAIL);
//            }
//    }
//    @Override
//    public int preparedStatmentForWholeTableData(String Name, int salary) throws EmployeePayrollException {
//        String sql = String.format("update  employeepayroll set salary=10 where name='Roni'");
//        try {
//            Connection connection = this.getConnection();
//            Statement statement = connection.prepareStatement(sql);
//            return statement.executeUpdate(sql);
//        } catch (SQLException throwables) {
//            throw new EmployeePayrollException("Cannot establish connection",EmployeePayrollException.ExceptionType.CONNECTION_FAIL);
//        }
//    }
//    List<EmployeePayrollData> preparedStatmentForWholeTableData(String name) throws EmployeePayrollException {
//        String sql = "select * from employeepayroll where name = 'Kitti'";
//        List<EmployeePayrollData> employeePayrollData = new ArrayList<EmployeePayrollData>();
//        try  {
//            Connection connection = this.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//            System.out.println("result::::::::::::"+resultSet);
//            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                //name = resultSet.getString(2);
//                double salary = resultSet.getDouble(3);
//                Date start = resultSet.getDate(4);
//                String gender = resultSet.getString(5);
//                employeePayrollData.add(new EmployeePayrollData(id, name, salary, start, gender));
//            }
//        } catch (SQLException e) {
//            throw new EmployeePayrollException("Cannot establish connection",EmployeePayrollException.ExceptionType.CONNECTION_FAIL);
//        }
//        return employeePayrollData;
//    }
//    public ArrayList<EmployeePayrollData> findEmployesJoinesForDateRange(String dateStart, String dateEnd) {
//        String sql = String.format("select * from employeepayroll where start between cast('%s' as date) " +
//                "and cast('%s' as date)", dateStart, dateEnd);
//        return this.executeSqlAndReturnList(sql);
//    }
}

