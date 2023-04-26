package com.whizpath.solid.department;

import com.whizpath.solid.user.EmployeeExpense;

import java.util.ArrayList;
import java.util.List;

public class DepartmentSalaryConsolidation implements ExpenseConsolidation{
    List<EmployeeExpense> employeeExpenseList;

    public DepartmentSalaryConsolidation(List<EmployeeExpense> employeeExpenseList){
        this.employeeExpenseList = employeeExpenseList;
    }

    @Override
    public long getTotal(int month,int year){
        long totalSalary = 0;
        for(EmployeeExpense employeeExpense:employeeExpenseList){
            totalSalary+=employeeExpense.monthlySalary(month,year);
        }
        return totalSalary;
    }

}
