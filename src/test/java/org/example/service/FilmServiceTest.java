package org.example.service;

import org.example.model.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmServiceTest {
    FilmService filmService ;
    Film film ;
    @BeforeEach
    void init() {
        filmService = new FilmService();
        film = new Film("johnwick", "action", "3:00",
                "English", 10.0, "noghrie");
    }

    @Test
    void save() {
        filmService.save(film);
        Film film2 = filmService.findById(film.getId());
        System.out.println(film.getId());
        assertEquals(film.getTitle(),film2.getTitle());
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void remove() {
    }

    @Test
    void update() {
    }
}