package com.company.FigureArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите тип фигуры, площадь которой хотите подсчитать (круг/квадрат/треугольник)");
        String choice = scanner.nextLine();

        switch (choice){
            case "круг":
                Main.createCircle();
                break;
            case "квадрат":
                Main.createSquare();
                break;
            case "треугольник":
                Main.createTriangle();
                break;
            default:
                System.out.println("Не корректная фигура");
                break;
        }

        moreGeometry();         // второе задание по фигурам
    }

    /**
     * Создаем круг и вычисляем его площадь.
     */
    public static void createCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение радиуса круга: ");
        int r = scanner.nextInt();
        Circle circle = new Circle(r);
        System.out.println("Площадь круга будет равна " + circle.calculateArea());
    }

    /**
     * Создаем квадрат и вычисляем его площадь.
     */
    public static void createSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение стороны квадрата: ");
        int r = scanner.nextInt();
        Square square = new Square(r);
        System.out.println("Площадь квадрата будет равна " + square.calculateArea());
    }

    /**
     * Создаем прямоугольный треугольник и вычисляем его площадь.
     */
    public static void createTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение первого катета: ");
        int r1 = scanner.nextInt();
        System.out.print("Введите значение второго катета: ");
        int r2 = scanner.nextInt();
        Triangle triangle = new Triangle(r1,r2);
        System.out.println("Площадь прямоугольного треугольника будет равна " + triangle.calculateArea());
    }

    /**
     * Задание "Больше геометрических фигур" (создаётся массив Area[] figure и заполняется полученными фигурами).
     */
    public static void moreGeometry(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение радиуса круга: ");
        int r = scanner.nextInt();
        Circle circle = new Circle(r);
        System.out.print("Введите значение стороны квадрата: ");
        int a = scanner.nextInt();
        Square square = new Square(a);
        System.out.print("Введите значение первого катета прямоугольного треугольника: ");
        int r1 = scanner.nextInt();
        System.out.print("Введите значение второго катета прямоугольного треугольника: ");
        int r2 = scanner.nextInt();
        Triangle triangle = new Triangle(r1,r2);
        Area[] figures = new Area[]{circle, square, triangle};
        System.out.println("Полученные площади круга, квадрата, прям. треугольника: ");
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculateArea());
        }
    }
}
