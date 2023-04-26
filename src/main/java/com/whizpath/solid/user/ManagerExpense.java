package com.whizpath.solid.user;

public class ManagerExpense implements EmployeeExpense, FullTimeEmployeeExpense{

    @Override
    public long monthlySalary(int month, int year) {
        return 10500L;
    }

    @Override
    public long getPerformancePay(int month, int year) {
        return 1500;
    }
}
