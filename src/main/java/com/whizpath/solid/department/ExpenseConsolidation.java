package com.whizpath.solid.department;

import com.whizpath.solid.user.EmployeeExpense;

public interface ExpenseConsolidation {
    public long getTotal(int month,int year);
}
