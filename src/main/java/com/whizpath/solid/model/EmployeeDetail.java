package com.whizpath.solid.model;

import com.whizpath.solid.service.EmployeeAddress;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDetail {
    private String employeeId;
    private String name;
    private LocalDate dateOfJoining;
    private EmployeeAddress employeeAddress;
}
