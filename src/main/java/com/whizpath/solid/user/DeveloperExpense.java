package com.whizpath.solid.user;

public class DeveloperExpense implements EmployeeExpense, FullTimeEmployeeExpense{
    @Override
    public long monthlySalary(int month, int year) {
        return 10000L;
    }

    @Override
    public long getPerformancePay(int month, int year) {
        return 1000;
    }

}
