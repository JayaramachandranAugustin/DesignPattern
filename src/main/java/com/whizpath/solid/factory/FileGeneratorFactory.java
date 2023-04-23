package com.whizpath.solid.factory;

import com.whizpath.solid.utility.CSVGenerator;
import com.whizpath.solid.utility.FileGenerator;
import com.whizpath.solid.utility.PDFGenerator;

public class FileGeneratorFactory {
    public static FileGenerator fileGenerator(String fileType){
        if("PDF".equals(fileType)){
            return new PDFGenerator();
        }else if("CSV".equals(fileType)){
            return new CSVGenerator();
        }
        return null;
    }
}
