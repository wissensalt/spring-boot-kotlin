package com.wissensalt.rnd.springbootkotlin.controller

import com.wissensalt.rnd.springbootkotlin.dto.RequestCreateEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.dto.ResponseEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/employee")
class EmployeeController(val employeeService: EmployeeService) {
    @PostMapping("/create")
    fun createEmployee(@RequestBody requestCreateEmployeeDTO: RequestCreateEmployeeDTO) : ResponseEmployeeDTO {
        return employeeService.createEmployee(requestCreateEmployeeDTO)
    }

    @GetMapping("/get")
    fun getEmployee(@RequestParam id: Int) : ResponseEmployeeDTO {
        return employeeService.getEmployee(id)
    }

    @GetMapping("/list")
    fun getListEmployee(@RequestParam size: Int, page: Int) : List<ResponseEmployeeDTO> {
        return employeeService.getListEmployee(size, page)
    }
}