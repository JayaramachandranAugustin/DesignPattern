package com.whizpath.solid.repository;

import com.whizpath.solid.model.EmployeeDetail;
import org.springframework.stereotype.Component;

@Component
public class EmployeePayrollRepository {
    public EmployeeDetail getEmployeePayrollData(String employeeId){
        return new EmployeeDetail();
    }
}
