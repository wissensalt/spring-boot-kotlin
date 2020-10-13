package com.wissensalt.rnd.springbootkotlin.repository

import com.wissensalt.rnd.springbootkotlin.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Int> {
}