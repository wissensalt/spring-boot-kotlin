package com.wissensalt.rnd.springbootkotlin.service

import com.wissensalt.rnd.springbootkotlin.dto.RequestCreateEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.dto.ResponseEmployeeDTO

interface EmployeeService {

    fun createEmployee(requestCreateEmployeeDTO: RequestCreateEmployeeDTO) : ResponseEmployeeDTO

    fun getEmployee(id: Int) : ResponseEmployeeDTO

    fun getListEmployee(size: Int, page: Int) : List<ResponseEmployeeDTO>
}