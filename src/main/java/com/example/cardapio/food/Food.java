package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Table(name = "foods")
@Entity(name = "foods")
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public Food(){}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }
}
