package com.learn.mongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "t_hello")
@Data
public class HelloEntity implements Serializable {
    @Id
    private Long id;

    private String title;

    private String description;

    private String by;

    private String url;
}
