package com.whizpath.solid.service;

import com.whizpath.solid.factory.FileGeneratorFactory;
import com.whizpath.solid.model.EmployeeDetail;
import com.whizpath.solid.repository.EmployeePayrollRepository;
import com.whizpath.solid.utility.FileGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class EmployeePayrollService {

    private final EmployeePayrollRepository employeePayrollRepository;

    public ByteArrayOutputStream getPayStub(String employeeId, LocalDate date, String fileType){

        //Call the database to get the employee data for the employeeId
        EmployeeDetail employeeDetail = employeePayrollRepository.getEmployeePayrollData(employeeId);

        //Generate the pdf report by the passing the data
        FileGenerator fileGenerator = FileGeneratorFactory.fileGenerator(fileType);
        ByteArrayOutputStream byteArrayOutputStream = fileGenerator.generateFile(employeeDetail);

        return byteArrayOutputStream;
    }
}
