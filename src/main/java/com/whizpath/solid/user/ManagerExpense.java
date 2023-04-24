package com.whizpath.solid.user;

public class ManagerExpense implements EmployeeExpense{

    @Override
    public long monthlySalary(int month, int year) {
        return 10500L;
    }

    @Override
    public long getPerformancePay(int year) {
        return 1500;
    }
}
