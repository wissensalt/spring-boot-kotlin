package com.wissensalt.rnd.springbootkotlin.repository

import com.wissensalt.rnd.springbootkotlin.converter.EmployeeConverter
import com.wissensalt.rnd.springbootkotlin.dto.RequestCreateEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.dto.ResponseEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.service.EmployeeService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Exception

@Service
class EmployeeServiceImpl(
        val employeeRepository: EmployeeRepository,
        val employeeConverter: EmployeeConverter)
    : EmployeeService {

    @Transactional
    override fun createEmployee(requestCreateEmployeeDTO: RequestCreateEmployeeDTO): ResponseEmployeeDTO {
        return employeeConverter.toResponseDTO(
                employeeRepository.save(
                                employeeConverter.toEntity(requestCreateEmployeeDTO)
                        )
                )
    }

    override fun getEmployee(id: Int): ResponseEmployeeDTO {
        val employee = employeeRepository.findById(id)
        if (!employee.isPresent) {
            throw Exception("Employee with Id $id is not found")
        }

        return employeeConverter.toResponseDTO(employee.get())
    }

    override fun getListEmployee(size: Int, page: Int): List<ResponseEmployeeDTO> {
        return employeeConverter.toListResponseDTO(employeeRepository.findAll(PageRequest.of(page, size)).content)
    }
}