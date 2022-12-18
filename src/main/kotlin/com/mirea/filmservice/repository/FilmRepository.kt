package com.mirea.filmservice.repository

import com.mirea.filmservice.entity.Film
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface FilmRepository : JpaRepository<Film?, UUID?> {
    fun findById(id: UUID?): Film?
}