package com.yoshallc.client.services;

import com.yoshallc.client.dtos.EmployeeReport;
import com.yoshallc.client.dtos.ReportFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ClientService {

    public EmployeeReport getEmployeeReport(ReportFilter reportFilter){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<EmployeeReport> responseEntity = restTemplate.postForEntity(
                "http://localhost:8084/v1/server/api/employee/data",reportFilter, EmployeeReport.class);

        return responseEntity.getBody();


    }







}
