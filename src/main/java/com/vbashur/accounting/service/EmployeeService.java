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

//    public boolean createEmployee(PersonalData personalData, FinancialData financialData) {
//        Employee createdEmployee = ImmutableEmployee.builder().financialData(f)of(personalData, financialData);
//        return createEmployee(createdEmployee);
//    }

    public boolean createEmployee(Employee createdEmployee) {
        System.out.println("createdEmployee count before = " + employeeRepository.findAll().count());
        WriteResult res = employeeRepository.insert(createdEmployee);
        System.out.println("createdEmployee count after = " + employeeRepository.findAll().count());
        System.out.println(res.insertedCount());
                System.out.println(res.deletedCount());
                        System.out.println(res.updatedCount());
                                System.out.println(res.totalCount());
        return res.insertedCount().orElse(0)  > 0;
    }
}
