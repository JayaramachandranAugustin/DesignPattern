package com.whizpath.solid.department;

import com.whizpath.solid.user.DeveloperExpense;
import com.whizpath.solid.user.EmployeeExpense;
import com.whizpath.solid.user.ManagerExpense;
import org.junit.jupiter.api.Test;

public class DepartmentConsolidationTest {


    @Test
    public void addSalaryTest() {
        EmployeeExpense developerExpense =new DeveloperExpense();
        EmployeeExpense managerExpense =new ManagerExpense();

        DepartmentConsolidation departmentConsolidation=new DepartmentConsolidation();
        departmentConsolidation.addEmployees(developerExpense);
        departmentConsolidation.addEmployees(managerExpense);

        System.out.println(departmentConsolidation.getTotalSalary(4,2023));

        System.out.println(departmentConsolidation.getTotalCompensation(2023));
    }

}
