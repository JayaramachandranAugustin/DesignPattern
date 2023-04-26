package com.whizpath.solid.department;

import com.whizpath.solid.user.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DepartmentConsolidationTest {


    @Test
    public void addSalaryTest() {
        List<EmployeeExpense> employeeExpenseList = new ArrayList<>();
        employeeExpenseList.add(new DeveloperExpense());
        employeeExpenseList.add(new ManagerExpense());
        employeeExpenseList.add(new InternExpense());
        ExpenseConsolidation departmentSalaryConsolidation=new DepartmentSalaryConsolidation(employeeExpenseList);

        System.out.println("Total salary "+departmentSalaryConsolidation.getTotal(4,2023));


        List<FullTimeEmployeeExpense> fullTimeEmployeeExpenseList = new ArrayList<>();
        fullTimeEmployeeExpenseList.add(new DeveloperExpense());
        fullTimeEmployeeExpenseList.add(new ManagerExpense());
        ExpenseConsolidation departmentConsolidation=new DepartmentCompensationConsolidation(fullTimeEmployeeExpenseList);

        System.out.println("Total compensation "+departmentConsolidation.getTotal(4,2023));
    }

}
