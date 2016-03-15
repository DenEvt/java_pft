package ru.train.devt;

public class Point {

    public static void main(String[] args) {
//      Координаты двух точек на плоскости A(x,y) B(x,y)
        Distance r = new Distance(1, 1, 1, 2);
        System.out.println("Длина отрезка между точкой A(" + r.ax + "," + r.ay + ")" + " и " + "точкой B(" + r.bx + "," + r.by + ")" + " = " + r.distance());
    }


}
