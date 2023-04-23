package com.whizpath.solid.utility;

import com.whizpath.solid.model.EmployeeDetail;

import java.io.ByteArrayOutputStream;

public class CSVGenerator implements FileGenerator{
    public ByteArrayOutputStream generateFile(EmployeeDetail employeeDetail){
        return new ByteArrayOutputStream();
    }
}
