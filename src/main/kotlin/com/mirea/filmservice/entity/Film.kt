package com.mirea.filmservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Film(
    @Id
    val id: UUID,
    val title: String,
    val authorId: UUID,
)