package com.vbashur.accounting.service;

import com.vbashur.accounting.domain.Employee;
import com.vbashur.accounting.domain.EmployeeRepository;
import com.vbashur.accounting.domain.FinancialData;
import com.vbashur.accounting.domain.ImmutableEmployee;
import com.vbashur.accounting.domain.PersonalData;
import org.immutables.criteria.backend.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    public boolean createEmployee(PersonalData personalData, FinancialData financialData) {
        Employee createdEmployee = ImmutableEmployee.of(personalData, financialData);
        return createEmployee(createdEmployee);
    }

    public boolean createEmployee(Employee createdEmployee) {
        WriteResult res = employeeRepository.insert(createdEmployee);
        return res.insertedCount().orElse(0)  > 0;
    }
}
