package com.wissensalt.rnd.springbootkotlin.dto

import org.apache.logging.log4j.util.Strings

data class RequestCreateEmployeeDTO (

    val name: String,

    val phoneNumber: String,

    val department: String
)