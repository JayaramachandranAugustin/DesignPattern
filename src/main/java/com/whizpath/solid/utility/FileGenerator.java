package com.whizpath.solid.utility;

import org.springframework.stereotype.Component;
import java.io.ByteArrayOutputStream;

@Component
public class FileGenerator {
    public ByteArrayOutputStream generateFile(String fileType){

        if(fileType == "PDF"){
            return new ByteArrayOutputStream();
        }else if(fileType == "XLS"){
            return new ByteArrayOutputStream();
        }
        return null;
    }
}
