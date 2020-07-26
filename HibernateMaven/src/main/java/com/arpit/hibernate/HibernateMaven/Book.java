package com.arpit.hibernate.HibernateMaven;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Book {
 
    @EmbeddedId
    private BookId id;
    private String genre;
    private Integer price;
 
    //standard getters and setters
}