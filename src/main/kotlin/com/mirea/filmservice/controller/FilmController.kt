package com.mirea.filmservice.controller

import com.mirea.filmservice.entity.Film
import com.mirea.filmservice.service.FilmService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/film")
class FilmController(
    private val filmService: FilmService,

    ) {

    @PostMapping("/")
    fun saveFilm(@RequestParam title: String, @RequestParam authorId: String): Film {
        return filmService.saveFilm(
            Film(
                id = UUID.randomUUID(),
                title = title,
                authorId = UUID.fromString(authorId)
            )
        )
    }

    @GetMapping ("/__health/")
    fun  checkHealth():Boolean{
        return true
    }

    @GetMapping("/{id}")
    fun getFilmById(@PathVariable("id") filmId: String): Film? {
        return filmService.getFilm(UUID.fromString(filmId))
    }
}