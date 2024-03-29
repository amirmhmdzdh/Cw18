package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String length;
    private String language;
    private double rating;
    private String directorName;

    public Film(String title, String description, String length, String language, double rating, String directorName) {
        this.title = title;
        this.description = description;
        this.length = length;
        this.language = language;
        this.rating = rating;
        this.directorName = directorName;
    }

    public Film(Long id) {
        this.id = id;
    }
}
