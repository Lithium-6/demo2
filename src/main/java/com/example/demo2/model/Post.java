package com.example.demo2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name,message;
    private Timestamp timestamp;

    public Post() {}

    public Post(String name, String message) {
        this.name = name;
        this.message = message;
        this.timestamp= new Timestamp(System.currentTimeMillis());
    }
}
