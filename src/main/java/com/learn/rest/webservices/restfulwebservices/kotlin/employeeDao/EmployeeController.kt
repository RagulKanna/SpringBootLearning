package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.data.jpa.repository.Query
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/employees")
class EmployeeController {
    val employeeService: EmployeeService

    constructor(employeeService: EmployeeService) {
        this.employeeService = employeeService
    }

    @PostMapping("/save")
    fun saveEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        return ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED)
    }

    @GetMapping("/allEmployees")
    fun getAllEmployeeDetails(): List<Employee> {
        return employeeService.getAllEmployees()
    }

    @GetMapping("/allEmployeesQuery")
    fun getAllEmployeeDetailsQuery(): Any {
        return employeeService.getAllEmployeesByQuery()
    }

    @GetMapping("{id}")
    fun getSpecificEmployeeDetails(@PathVariable("id") employeeId: Long): ResponseEntity<Employee> {
        return ResponseEntity<Employee>(employeeService.getSpecificEmployee(employeeId), HttpStatus.OK)
    }

    @PutMapping("/updateEmployee/{id}")
    fun updateSpecificEmployeeDetails(@RequestBody employee: Employee, @PathVariable("id") id: Int): String {
        employeeService.updateSpecificEmployeeById(employee, id.toLong())
        return "Employee Details is updated successfully"
    }

    @DeleteMapping("/deleteEmployee/{id}")
    fun deleteSpecificEmployeeDetails(@PathVariable("id") id: Int): String {
        employeeService.deleteSpecificEmployeeById(id.toLong())
        return "Employee Details is Deleted successfully"
    }
}