package com.company.FigureArea;

public class Circle implements Area{

    private int radius;         //радиус круга
    private final double pi = 3.14159;

    /**
     * Переопределение метода "calculateArea".
     * @return площадь круга.
     */
    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }

    /**
     * Конструктор с параметром.
     * @param radius - радиус круга.
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    private Circle() {
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
