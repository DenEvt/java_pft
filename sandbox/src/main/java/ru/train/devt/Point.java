package ru.train.devt;

/**
 * Created by Kad on 08.03.2016.
 */
public class Point {

  public static void main(String[] args) {
    Distance r = new Distance(1, 1, 3, 2);
    System.out.println("Длинна отрезка между точкой A(" + r.ax + "," + r.ay + ")" + " и " + "точкой B(" + r.bx + "," + r.by + ")" + " = " + r.distance());
  }


}
