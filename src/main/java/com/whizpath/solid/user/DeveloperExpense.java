package com.whizpath.solid.user;

public class DeveloperExpense implements EmployeeExpense{
    @Override
    public long monthlySalary(int month, int year) {
        return 10000L;
    }

    @Override
    public long getPerformancePay(int year) {
        return 1000;
    }

}
