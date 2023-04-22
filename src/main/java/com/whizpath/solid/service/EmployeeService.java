package com.whizpath.solid.service;

import com.whizpath.solid.model.EmployeeDetail;

import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.time.LocalDate;

public class EmployeeService {
    public int getLeaveBalance(String employeeId){
        int balance = 0;
        //call database to get the balance
        return balance;
    }

    public boolean applyLeave(String employeeId, LocalDate leaveDate){
        //Check if the employee has leave balance

        //Update the database with the leave

        return true;
    }

    public URI getReferralLink(String employeeId){
        URI uri=URI.create("");

        //Database call to register the referral and return the registered referral link

        return uri;
    }

    public boolean changeContactInfo(EmployeeDetail employeeDetail){

        //Database call to update the contactInfo

        return true;
    }

    public ByteArrayOutputStream generatePayStub(String employeeId, LocalDate date,String fileType){

        //Call the database to get the employee data for the employeeId

        //Generate the pdf report by the passing the data
        ByteArrayOutputStream byteArrayOutputStream = generateFile(fileType);

        return byteArrayOutputStream;
    }

    private ByteArrayOutputStream generateFile(String fileType){

        if(fileType == "PDF"){
            return new ByteArrayOutputStream();
        }else if(fileType == "XLS"){
            return new ByteArrayOutputStream();
        }
        return null;
    }
}
