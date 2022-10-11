package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl : EmployeeService {
    val employeeRepository: EmployeeRepository

    constructor(employeeRepository: EmployeeRepository) {
        this.employeeRepository = employeeRepository
    }

    override fun saveEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun getAllEmployees(): List<Employee> {
        return employeeRepository.findAll()
    }

    override fun getSpecificEmployee(id: Long): Employee? {
        /*   val employee = employeeRepository.findById(id)
           return if (employee.isPresent) {
               employee.get()
           } else {
               throw ResourceNotFoundException("Employee", "employee", null)
           }*/
        // lamda approach
        return employeeRepository.findById(id).orElseThrow {
            ResourceNotFoundException(
                "Employee",
                "Id",
                id
            )
        }
    }

    override fun updateSpecificEmployeeById(employee: Employee, id: Long): Employee {
        val employeeDB = employeeRepository.findById(id).orElseThrow {
            ResourceNotFoundException(
                "Employee",
                "Id",
                id!!
            )
        }
        employeeDB.firstName = employee.firstName
        employeeDB.lastName = employee.lastName
        employeeDB.email = employee.email
        employeeRepository.save(employeeDB)
        return employeeDB
    }

    override fun deleteSpecificEmployeeById(id: Long) {
        employeeRepository.findById(id).orElseThrow {
            ResourceNotFoundException(
                "Employee",
                "Id",
                id!!
            )
        }
        employeeRepository.deleteById(id)
    }


}