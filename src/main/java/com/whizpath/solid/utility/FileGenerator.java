package com.whizpath.solid.utility;

import com.whizpath.solid.model.EmployeeDetail;
import org.springframework.stereotype.Component;
import java.io.ByteArrayOutputStream;


public interface FileGenerator {
    public ByteArrayOutputStream generateFile(EmployeeDetail employeeDetail);
}
