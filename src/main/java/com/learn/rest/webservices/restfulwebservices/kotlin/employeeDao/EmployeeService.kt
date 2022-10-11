package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

interface EmployeeService {
    fun saveEmployee(employee: Employee): Employee
    fun getAllEmployees(): List<Employee>
    fun getSpecificEmployee(id: Long): Employee?
    fun updateSpecificEmployeeById(employee: Employee, id: Long): Employee
    fun deleteSpecificEmployeeById(id: Long)
}