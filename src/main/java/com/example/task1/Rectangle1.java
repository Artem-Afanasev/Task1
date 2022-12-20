package com.example.task1;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle1 extends Shape1 {
    @Override
    double area() {
        return 0;
    }


    public Rectangle1(int V) {
        //super(x, y);
        this.V = V;
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.strokeRect(x, y, 150, V);
    }
    @Override
    public String toString(){return"Rectangle1";}
}
