package com.whizpath.solid.utility;

import com.whizpath.solid.model.EmployeeDetail;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;

@Component
public class PDFGenerator implements FileGenerator{
    public ByteArrayOutputStream generateFile(EmployeeDetail employeeDetail){
        return new ByteArrayOutputStream();
    }
}
