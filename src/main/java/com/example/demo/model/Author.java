package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data //automatically generating getters and setters with lombok
@Document(collection = "authors")
public class Author {
    @Id
    private String id;
    private String name;
    private Integer age;

    public Author(String id) {
        this.id = id;
    }

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
