package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = 40;
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      //         If the guess is correct --#4
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      if (i == 8)
      {
        MessageBox.showMessage("You lost");
      }
    }
  }
}
