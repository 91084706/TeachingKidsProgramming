package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses_AllRoofs
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Fiona");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(120);
    drawHouseSlantedRoof(90);
    drawHouseTrapezoidRoof(20);
  }
  private static void drawHouseTrapezoidRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(25);
    Tortoise.move(20);
    Tortoise.turn(65);
    Tortoise.move(20);
    Tortoise.turn(70);
    Tortoise.move(20);
    Tortoise.turn(20);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.move(30);
    Tortoise.turn(120);
    Tortoise.move(40);
    Tortoise.turn(60);
    Tortoise.move(10);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}