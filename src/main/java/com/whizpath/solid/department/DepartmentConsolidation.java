package com.whizpath.solid.department;

import com.whizpath.solid.user.EmployeeExpense;

import java.util.ArrayList;
import java.util.List;

public class DepartmentConsolidation {
    List<EmployeeExpense> employeeList;

    public DepartmentConsolidation(){
        employeeList = new ArrayList<>();
    }

    public void addEmployees(EmployeeExpense employeeExpense){
        employeeList.add(employeeExpense);
    }

    public long getTotalSalary(int month,int year){
        long totalSalary = 0;
        for(EmployeeExpense employeeExpense:employeeList){
            totalSalary+=employeeExpense.monthlySalary(month,year);
        }
        return totalSalary;
    }

    public long getTotalCompensation(int year){
        long totalPerformancePay = 0;
        for(EmployeeExpense employeeExpense:employeeList){
            totalPerformancePay+=employeeExpense.getPerformancePay(year);
        }
        return totalPerformancePay;
    }
}
