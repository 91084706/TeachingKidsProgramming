package org.teachingkidsprogramming.section03ifs.HiLowVariations;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
// this variation tells the user how many guesses they have left

public class HiLow5
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int i;
    int answer = rand.nextInt(100) + 1;
    /*
     * int answer = (int) (Math.random() * 100 + 1);
     */
    //System.out.println("The answer: " + answer);
    //int answer = 40;
    int numberOfGuesses = MessageBox.askForNumericalInput("How many guesses?");
    int upperRange = 100;
    for (i = 1; i <= numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess between 1 and " + upperRange + "?");
      //input validation
      while (guess < 1 || guess > upperRange)
      {
        MessageBox.showMessage("Please enter a valid guess between 1 and " + upperRange);
        guess = MessageBox.askForNumericalInput("What is your guess between 1 and " + upperRange + "?");
      }
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
      if (i == numberOfGuesses)
      {
        MessageBox.showMessage("You lost");
      }
      //MessageBox.showMessage("Number of guess left: " + (8 - i));
    }
  }
}
