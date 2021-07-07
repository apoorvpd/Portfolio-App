package com.example.portfolioapp;

public class Project {

    String name;
    String description;
    // R.drawable.name_of_the_file (this will be some sort of number, an 'int')
    // e.g. 15238475
    int image;


    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
