package com.whizpath.solid.department;


import com.whizpath.solid.user.FullTimeEmployeeExpense;

import java.util.List;

public class DepartmentCompensationConsolidation  implements ExpenseConsolidation{
    List<FullTimeEmployeeExpense> fullTimeEmployeeExpenseList;

    public DepartmentCompensationConsolidation(List<FullTimeEmployeeExpense> fullTimeEmployeeExpenseList){
        this.fullTimeEmployeeExpenseList = fullTimeEmployeeExpenseList;
    }

    public long getTotal(int month,int year){
        long totalPerformancePay = 0;
        for(FullTimeEmployeeExpense fullTimeEmployeeExpense:fullTimeEmployeeExpenseList){
            totalPerformancePay+=fullTimeEmployeeExpense.getPerformancePay(month,year);
        }
        return totalPerformancePay;
    }
}
