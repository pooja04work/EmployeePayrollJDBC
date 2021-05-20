package com.bridgelabz;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollData {
    int emp_id;
    String emp_name;
    double emp_salary;
    Date emp_start;
    String emp_gender;

    public EmployeePayrollData(int emp_id, String emp_name, double emp_salary, Date emp_start, String emp_gender){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.emp_start = emp_start;
        this.emp_gender = emp_gender;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Date getEmp_start() {
        return emp_start;
    }

    public void setEmp_start(Date emp_start) {
        this.emp_start = (Date) emp_start;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = this.emp_gender;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary=" + emp_salary +
                ", emp_start=" + emp_start +
                ", emp_gender='" + emp_gender + '\'' +
                '}';
    }
}
