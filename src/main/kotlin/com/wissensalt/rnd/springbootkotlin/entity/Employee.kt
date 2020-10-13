package com.wissensalt.rnd.springbootkotlin.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "employee")
@EntityListeners(AuditingEntityListener::class)
data class Employee(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int?,

        @CreatedDate
        val createdAt: LocalDateTime,

        @LastModifiedDate
        val updatedAt: LocalDateTime?,

        val name: String,

        val phoneNumber: String,

        val department: String
)