package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.data.jpa.repository.Query

interface EmployeeService {
    fun saveEmployee(employee: Employee): Employee
    fun getAllEmployees(): List<Employee>
    fun getSpecificEmployee(id: Long): Employee?
    fun updateSpecificEmployeeById(employee: Employee, id: Long): Employee
    fun deleteSpecificEmployeeById(id: Long)
    fun getAllEmployeesByQuery(): Any
}