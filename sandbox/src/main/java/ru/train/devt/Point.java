package ru.train.devt;

/**
 * Created by Kad on 08.03.2016.
 */
public class Point {

  public static void main(String[] args) {
    double ax = 1;
    double ay = 1;
    double bx = 3;
    double by = 2;

    double distance = Math.sqrt((bx - ax) * (bx - ax) + (by - ay) * (by - ay));
    System.out.println("Длинна отрезка между точкой A(" + ax + "," + ay + ")" + " и " + "точкой B(" + bx + "," + by + ")" + " = " + distance);
  }


}
