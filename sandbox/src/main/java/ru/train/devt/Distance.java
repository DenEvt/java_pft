package ru.train.devt;

/**
 * Created by Kad on 09.03.2016.
 */
public class Distance {
  public double ax;
  public double ay;
  public double bx;
  public double by;

  public Distance(double ax, double ay, double bx, double by) {
    this.ax = ax;
    this.ay = ay;
    this.bx = bx;
    this.by = by;
  }

  public double distance() {
    double ac = this.bx - this.ax;
    double bc = this.by - this.ay;
    double ab2 = Math.pow(ac, 2) + Math.pow(bc, 2);
    return Math.sqrt(ab2);
  }
}
