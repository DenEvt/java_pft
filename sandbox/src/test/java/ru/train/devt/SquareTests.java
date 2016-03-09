package ru.train.devt;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Kad on 09.03.2016.
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(6);
    //    System.out.println(s.area());
    Assert.assertEquals(s.area(), 36.0);
  }
}
