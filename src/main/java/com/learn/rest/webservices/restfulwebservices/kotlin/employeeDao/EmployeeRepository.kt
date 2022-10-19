package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long> {
    @Query(value = "select first_name,last_name,email from employees where id = '3';", nativeQuery = true)
    fun getAllEmployeesQuery(): List<Any>
}