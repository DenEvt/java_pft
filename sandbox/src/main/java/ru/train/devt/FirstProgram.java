package ru.train.devt;

public class FirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!!!");
    hi("Vasya");
    double l = 5.2;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 5.4;
    System.out.println("Площадь прямоугольника со сторонами " + a + b + "=" + area(a, b));
  }

  public static void hi(String somebody) {
    System.out.println("Hello, " + somebody + "!!!");
  }

  public static double area(double a, double b) {
    return a * b;
  }

  public static double area(double len) {
    return len * len;
  }


}

