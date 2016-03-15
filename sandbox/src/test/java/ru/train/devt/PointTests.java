package ru.train.devt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Distance r = new Distance(1, 1, 1, 2);
    Assert.assertEquals(r.distance(), 1.0);
  }
}
