package com.whizpath.solid.user;

/*
    Against liskov substitution principle
 */
public class InternExpense implements EmployeeExpense{

    @Override
    public long monthlySalary( int month, int year) {
        return 500L;
    };
}
