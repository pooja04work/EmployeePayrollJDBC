package com.bridgelabz;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;


public class DatabaseConnection {
    private static Connection connection;
    public  static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll?useSSL=false";
        String userName = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath", e);
        }
        listDrivers();
        try {
            System.out.println("Connectinng to database:" + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection is successful!!!" + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void listDrivers() {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (((Enumeration<?>) driverList).hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println("  " + driverClass.getClass().getName());
        }
    }
    public static Connection getConnection() {return connection;}
}

