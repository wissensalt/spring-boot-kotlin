package com.wissensalt.rnd.springbootkotlin.dto

import org.apache.logging.log4j.util.Strings

data class RequestCreateEmployeeDTO (

    val name: String = Strings.EMPTY,

    val phoneNumber: String = Strings.EMPTY,

    val department: String = Strings.EMPTY

)