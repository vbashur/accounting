package com.vbashur.accounting.controller;

import com.vbashur.accounting.domain.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class StatusController {

    private final String version;


    public StatusController(@Value("${spring.application.version}") String version) {
        this.version = version;
    }

    @GetMapping(value = {"/status"}, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> status() {

        String resultBody = new JSONObject()
            .put("status", "success")
            .put("version", this.version)
            .toString();


        String employeeRepresentation = new JSONObject()
                .put("personalData", new JSONObject().put("name", "employeeName"))
                .put("financialData", new JSONObject().put("monthIncome", "salary"))
                .toString();
        FinancialData fd = ImmutableFinancialData.builder().monthIncome(1.2).build();
        PersonalData pd = ImmutablePersonalData.builder().name("name").build();
        Employee e = ImmutableEmployee.builder()
                .id("id")
                .financialData(fd).personalData(pd).build();

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(resultBody + "\njson\n" + employeeRepresentation + "\n\n\nobject\n" + e.toString());
    }


}
