package com.wissensalt.rnd.springbootkotlin.dto

data class ResponseEmployeeDTO (

        val id: Int?,

        val createdAt: String?,

        val updatedAt: String?,

        val name: String,

        val phoneNumber: String,

        val department: String

)