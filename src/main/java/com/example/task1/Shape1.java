package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape1 implements Cloneable {

    //параметры фигуры - приватные поля

    protected Color color;

    protected double x, y;
    protected int V;

    // объявление абстрактных методов

    abstract double area();

    abstract void draw( GraphicsContext gr);
    //abstract void draw( GraphicsContext gr, int x, int y);

    // конструктор

    public Shape1(double x, double y) {
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    }
    public Object clone() {

        Object clone = null;

        try {

            clone = super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();   }

        return clone; }

    public Shape1() {
        this.color = Color.BLACK;
        this.x = 1;
        this.y = 1;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setV(int V) {
        this.V = V;
    }

// реализация методов

    public void setColor(Color color) {

        this.color=color;     }
}

