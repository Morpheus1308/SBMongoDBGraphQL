package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String description;
    private String author_id;

    public Book() {
    }

    public Book(String title, String description, String author_id) {
        this.title = title;
        this.description = description;
        this.author_id = author_id;
    }
}
