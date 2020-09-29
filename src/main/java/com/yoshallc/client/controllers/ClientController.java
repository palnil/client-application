package com.yoshallc.client.controllers;

import com.yoshallc.client.dtos.EmployeeReport;
import com.yoshallc.client.dtos.ReportFilter;
import com.yoshallc.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/client/api")
public class ClientController {


    @Autowired
    ClientService clientService;

    @PostMapping(value = "/employee/report",consumes = "application/json", produces = "application/json")
    public EmployeeReport employeeReport(@RequestBody ReportFilter reportFilter){

        return clientService.getEmployeeReport(reportFilter);

    }

}
