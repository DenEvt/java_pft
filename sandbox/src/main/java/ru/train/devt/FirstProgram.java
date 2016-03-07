package ru.train.devt;

public class FirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!!!");
    hi("Vasya");

    Square s = new Square(8);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hi(String somebody) {
    System.out.println("Hello, " + somebody + "!!!");
  }
}

