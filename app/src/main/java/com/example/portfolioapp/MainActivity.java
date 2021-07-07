package com.example.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Project[] projects = {
                new Project("Getting Started App",
                        "Our very first project, the default 'Hello World' app!",
                        5),
                new Project("Motivation Quote",
                        "Making a simple change to the layout, with my own personal motivation quote for software developers",
                        5),
                new Project("BMI Calculator",
                        "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic",
                        5),
                new Project("Inches Converter",
                        "A basic converter to convert inches to meters (my own personal calculator app made on my own)",
                        5),
                new Project("The Hungry Developer",
                        "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and ListViews",
                        5),
        };
    }
}