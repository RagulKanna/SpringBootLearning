package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long>{}