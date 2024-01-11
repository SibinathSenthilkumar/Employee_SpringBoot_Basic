package com.example.employeeKgs.company.services;

import com.example.employeeKgs.company.module.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ImplementEmployee implements InterfaceEmployee{

      private final Map<Integer, Employee> employeeMap = new HashMap<>();

      @Override
      public List<Employee> getAllEmployees() {

            return new  ArrayList<>(employeeMap.values());
      }

      @Override
      public Employee getEmployeeById(Integer employeeId) {

            return  employeeMap.get(employeeId);
      }

      @Override
      public Employee addEmployee(Employee employee) {
             return employeeMap.put(employee.getEmployeeId(), employee);
      }


      @Override
      public Employee deleteEmployee(Integer employeeId) {
           return employeeMap.remove(employeeId);
      }

      public void updateEmployee(Integer employeeId) {
            Employee existingEmployee = employeeMap.get(employeeId);
      }

}
