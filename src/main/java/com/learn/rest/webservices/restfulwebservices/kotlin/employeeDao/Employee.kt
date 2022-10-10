package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "employees")
data class Employee(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "firstName")
    var firstName: String,

    @Column(name = "lastName")
    var lastName: String,

    @Column(name = "email")
    var email: String
)
