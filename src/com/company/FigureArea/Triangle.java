package com.company.FigureArea;

public class Triangle implements Area{

    private int cathet1;        // катеты
    private int cathet2;

    /**
     * Переопределение метода "calculateArea".
     * @return площадь треугольника.
     */
    @Override
    public double calculateArea() {
        return cathet1 * cathet2 * 0.5;
    }

    /**
     * Конструктор с параметрами.
     * @param cathet1 - катет1
     * @param cathet2 - катет2
     */
    public Triangle(int cathet1, int cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    private Triangle() {
    }

    public int getCathet1() {
        return cathet1;
    }

    public void setCathet1(int cathet1) {
        this.cathet1 = cathet1;
    }

    public int getCathet2() {
        return cathet2;
    }

    public void setCathet2(int cathet2) {
        this.cathet2 = cathet2;
    }
}
