package com.whizpath.solid.repository;


import com.whizpath.solid.model.EmployeeDetail;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EmployeeRepository {
    public int getLeaveBalance(String employeeId){
        return 1;
    }

    public boolean updateEmployeeLeave(String employeeId, LocalDate stateDate, LocalDate endDate){
        return true;
    }

    public boolean updateEmployeeAddress(EmployeeDetail employeeDetail){
        return true;
    }
}
