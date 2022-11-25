package com.company.FigureArea;

public class Square implements Area{
    private int side;       // сторона квадрата

    /**
     * Переопределение метода "calculateArea".
     * @return площадь квадрата.
     */
    @Override
    public double calculateArea() {
        return side*side;
    }

    /**
     * Конструктор с параметром.
     * @param side - сторона квадрата
     */
    public Square(int side) {
        this.side = side;
    }

    private Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
