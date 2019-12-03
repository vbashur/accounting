package com.vbashur.accounting.controller;

import com.vbashur.accounting.domain.AccountingResponse;
import com.vbashur.accounting.domain.Employee;
import com.vbashur.accounting.domain.EmployeeRepository;
import com.vbashur.accounting.domain.ImmutableAccountingResponse;
import com.vbashur.accounting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<AccountingResponse> createEmployee(@RequestBody Employee employee) {

        if (employeeService.createEmployee(employee)) {

            String message = String.format("Employee '%s' with salary '%f has been created",
                employee.personalData().name(),
                employee.financialData().monthIncome());

            AccountingResponse response = ImmutableAccountingResponse.builder()
                .addEmployees(employee)
                .message(message)
                .build();

            return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
        } else {
            String message = "No employee has been created";
            AccountingResponse response = ImmutableAccountingResponse.builder()
                .message(message)
                .build();

            return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);

        }
    }
}
