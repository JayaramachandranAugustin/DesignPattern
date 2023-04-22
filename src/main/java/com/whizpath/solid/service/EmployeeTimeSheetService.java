package com.whizpath.solid.service;

import com.whizpath.solid.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class EmployeeTimeSheetService {

    private final EmployeeRepository employeeRepository;

    public int getLeaveBalance(String employeeId){
        //call database to get the balance
        int balance = employeeRepository.getLeaveBalance(employeeId);
        return balance;
    }

    public boolean applyLeave(String employeeId, LocalDate startDate, LocalDate endDate){
        //Check if the employee has leave balance
        if(getLeaveBalance(employeeId) > 0) {
            return  false;
        }

        //Update the database with the leave
        return employeeRepository.updateEmployeeLeave(employeeId,startDate,endDate);
    }
}
