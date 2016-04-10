package com.jagwarrx.stormy;


import android.graphics.Color;

import java.util.Random;

//declaring class that has a string and method
public class ColorWheel {

    private String[] nColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#637a91", // dark gray

    };

    public int getColor()  //method
    {

        String color;

        // generate random number
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(nColors.length); //Chooses random number
        color = nColors[randomNumber]; //Storing in variable
        int colorAsInt = Color.parseColor(color); //changing to int

        return colorAsInt; //returning int variable


    }
}
