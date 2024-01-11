package com.example.employeeKgs.company.services;

import com.example.employeeKgs.company.module.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InterfaceEmployee {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer employeeId);
    Employee addEmployee(Employee employee);

    Employee deleteEmployee(Integer employeeId);
    void updateEmployee(Integer employeeId);

}
