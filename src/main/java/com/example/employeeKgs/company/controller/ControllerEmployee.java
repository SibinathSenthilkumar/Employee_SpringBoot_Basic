package com.example.employeeKgs.company.controller;

import com.example.employeeKgs.company.module.Employee;
import com.example.employeeKgs.company.services.ImplementEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerEmployee {
@Autowired
ImplementEmployee implementEmployee;
    @GetMapping("/all")

    public List<Employee> getAllEmployees() {
        return implementEmployee.getAllEmployees();
    }
    @GetMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer employeeId) {
        Employee employee = implementEmployee.getEmployeeById(employeeId);

        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cd 
    }

    @PostMapping("/{employeeId}")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee addedEmployee = implementEmployee.addEmployee(employee);
        return new ResponseEntity<>(addedEmployee, HttpStatus.CREATED);
    }

    @DeleteMapping("/employees1/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer employeeId) {
        Employee deletedEmployee = implementEmployee.deleteEmployee(employeeId);

       // if (deletedEmployee != null) {
          //  return new ResponseEntity<>(deletedEmployee, HttpStatus.OK);
       // } else {
           // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        //}
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PostMapping("/update/{employeeId}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer employeeId) {

        implementEmployee.updateEmployee(employeeId);

        return ResponseEntity.ok("Employee updated successfully");
    }

}
