package org.example;

import org.example.model.Film;
import org.example.repository.FilmRepository;
import org.example.service.FilmService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        todo: begginer
//        FilmRepository filmRepository = new FilmRepository();
//        filmRepository.save(new Film("titanic", "fizik" , "3:00" ,
//                "English" , 9.7 , "ghazi"));
//
//        filmRepository.save(new Film("johnwick", "action" , "3:00" ,
//                "English" , 10.0 , "noghrie"));

//        filmRepository.remove(1L);


//        todo: good performance
        FilmService filmService = new FilmService();
//        filmService.save(new Film("johnwick", "action" , "3:00" ,
//                "English" , 10.0 , "noghrie"));
//
//        filmService.save(new Film("titanic", "fizik" , "3:00" ,
//                "English" , 9.7 , "ghazi"));

//        System.out.println(filmService.findAll());

//        System.out.println(filmService.findById(2L));

//        filmService.remove(2L);

        String name = "asghar";
        Film film = filmService.findById(3L);
        film.setTitle(name);
        film.setLanguage("persian");
        filmService.update(film);
    }
}