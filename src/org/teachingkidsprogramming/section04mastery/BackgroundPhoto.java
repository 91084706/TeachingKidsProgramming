package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class BackgroundPhoto
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    String currPicture = "https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1";
    Tortoise.getBackgroundWindow().setBackgroundImage(currPicture);
    Tortoise.show();
    Tortoise.setSpeed(10);
    int side = 2;
    for (int i = 0; i < 75; i++)
    {
      Color currColor = PenColors.Yellows.Yellow;
      Tortoise.setPenColor(currColor);
      side++;
      Tortoise.move(side);
      Tortoise.setX(555);
      Tortoise.setY(65);
      Tortoise.turn(360 / 3);
      Tortoise.turn(1);
    }
  }
}
