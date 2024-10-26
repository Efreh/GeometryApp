package com.efr.app;

import com.efr.geometric.figure.Circle;
import com.efr.geometric.figure.Rectangle;
import com.efr.geometric.figure.Triangle;
import com.efr.geometric.three_dimensional_figure.Sphere;
import org.efr.utils.FigureEquals;

public class GeometryTestApp {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Фигура : " +
                circle.getName() +
                ". Периметр : " + circle.calculatePerimeter()
                + ". Площадь : " + circle.calculateSquare());

        Rectangle rectangle = new Rectangle(20,30);
        System.out.println("Фигура : " +
                rectangle.getName() +
                ". Периметр : " + rectangle.calculatePerimeter()
                + ". Площадь : " + rectangle.calculateSquare());

        Triangle triangle = new Triangle(2,4,3);
        System.out.println("Фигура : " +
                triangle.getName() +
                ". Периметр : " + triangle.calculatePerimeter()
                + ". Площадь : " + triangle.calculateSquare());

        System.out.println("Проверка равенства фигур по площади : " +
                FigureEquals.isAreaEqual(new Circle(5),
                        new Circle(6)));

        System.out.println();
        System.out.println();

        Sphere sphere = new Sphere(5);
        System.out.println("Фигура : " +
                sphere.getName() +
                ". Объем : " + sphere.calculateVolume()
                + ". Площадь : " + sphere.calculateSurfaceArea());
    }
}
