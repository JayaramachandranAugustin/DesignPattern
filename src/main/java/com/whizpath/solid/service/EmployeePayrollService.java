package com.whizpath.solid.service;

import com.whizpath.solid.utility.FileGenerator;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class EmployeePayrollService {

    private final FileGenerator fileGenerator;

    public ByteArrayOutputStream generatePayStub(String employeeId, LocalDate date, String fileType){

        //Call the database to get the employee data for the employeeId

        //Generate the pdf report by the passing the data
        ByteArrayOutputStream byteArrayOutputStream = fileGenerator.generateFile(fileType);

        return byteArrayOutputStream;
    }
}
