package com.whizpath.solid.service;

import com.whizpath.solid.repository.EmployeeReferralRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class EmployeeReferralService {

    private final EmployeeReferralRepository employeeReferralRepository;

    public URI getReferralLink(String employeeId){

        //Database call to register the referral and return the registered referral link
        String link=employeeReferralRepository.registerEmployeeReferral(employeeId);


        URI uri=URI.create(link);

        return uri;
    }

}
