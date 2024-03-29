package org.example.service;

import org.example.model.Film;
import org.example.repository.FilmRepository;

import java.util.List;

public class FilmService {
    private final FilmRepository filmRepository = new FilmRepository();

    public void save(Film film) {
        filmRepository.save(film);
    }

    public Film findById(Long id) {
        return filmRepository.findById(id);
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public void remove(Long id) {
//        Film film = filmRepository.findById(id);
        Film film = new Film(id);
        filmRepository.remove(film);
    }

    public void update(Film film) {
        filmRepository.update(film);
    }
}
