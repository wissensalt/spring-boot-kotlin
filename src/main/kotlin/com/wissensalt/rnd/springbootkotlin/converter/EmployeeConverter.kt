package com.wissensalt.rnd.springbootkotlin.converter

import com.wissensalt.rnd.springbootkotlin.dto.RequestCreateEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.dto.ResponseEmployeeDTO
import com.wissensalt.rnd.springbootkotlin.entity.Employee
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Component
class EmployeeConverter {
    fun toEntity(requestCreateEmployeeDTO: RequestCreateEmployeeDTO) : Employee {
        return Employee(
                null,
                LocalDateTime.now(),
                null,
                requestCreateEmployeeDTO.name,
                requestCreateEmployeeDTO.phoneNumber,
                requestCreateEmployeeDTO.department
        )
    }

    fun toResponseDTO(employee: Employee) : ResponseEmployeeDTO {
        val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss")

        return ResponseEmployeeDTO(
                employee.id,
                formatter.format(employee.createdAt),
                if (employee.updatedAt != null) formatter.format(employee.updatedAt) else null,
                employee.name,
                employee.phoneNumber,
                employee.department
        )
    }

    fun toListResponseDTO(employeeList: List<Employee>) : List<ResponseEmployeeDTO> {
        if (employeeList.isEmpty()) {
            return Collections.emptyList()
        }

        return employeeList.map {toResponseDTO(it)}
    }
}