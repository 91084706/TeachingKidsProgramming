package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGiza
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    makePyramid1();
    makePyramid2();
    makePyramid3();
  }
  private static void makePyramid3()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void makePyramid2()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
  }
  private static void makePyramid1()
  {
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
