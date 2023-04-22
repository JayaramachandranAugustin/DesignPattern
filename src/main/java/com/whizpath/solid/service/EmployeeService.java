package com.whizpath.solid.service;

import com.whizpath.solid.model.EmployeeDetail;
import com.whizpath.solid.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public boolean changeContactInfo(EmployeeDetail employeeDetail){

        //Database call to update the contactInfo
        return employeeRepository.updateEmployeeAddress(employeeDetail);
    }


}
