package com.mirea.filmservice.service

import com.mirea.filmservice.entity.Film
import com.mirea.filmservice.repository.FilmRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class FilmService(
    private val filmRepository: FilmRepository,
) {

    fun saveFilm(jpaUser: Film): Film {
        return filmRepository.save(jpaUser)
    }

    fun getFilm(filmId: UUID?): Film? {
        return filmRepository.findById(filmId)
    }
}