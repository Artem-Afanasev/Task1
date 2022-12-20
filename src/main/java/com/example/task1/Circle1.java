package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle1  extends Shape1 {
    double radius = 5;

    public Circle1() {
        //super(x, y);
        this.radius = radius;
    }

    /*
    public Circle() {
        super();
        this.radius = radius;
    }
*/


    @Override
    double area() {
        return 0;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLACK);
        gr.setLineWidth(10);
        gr.strokeOval(x, y, radius, radius);
        //gr.fillOval(x, y, radius, radius);
    }
    @Override
    public String toString(){return"Circle1";}
}

