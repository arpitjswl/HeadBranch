package com.arpit.hibernate.HibernateMaven;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BookId implements Serializable {
 
    private String author;
    private String name;
 
    // standard getters and setters
}