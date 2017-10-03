package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    int i;
    Tortoise.show();
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      if (i % 20 == 0)
      {
        for (int j = 0; j < 360; j++)
        {
          Tortoise.move(1);
          Tortoise.turn(1);
          Tortoise.setPenWidth(1 / 100 * i);
        }
      }
    }
  }
}