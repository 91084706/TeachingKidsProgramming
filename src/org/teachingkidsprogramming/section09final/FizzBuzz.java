package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  //   For the whole numbers from 1 to 100, print either that number, or, 
  int num = 0;
  //for or if
  {
    //    If that number is divisible by 3, then print the word 'Fizz', 
    if (num % 3 == 0)
    {
      System.out.println("Fizz");
    }
    //    If that number is divisible by 5, then print the word 'Buzz', 
    else if (num % 5 == 0)
    {
      System.out.println("Buzz");
    }
    //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
    else if (num % 15 == 0)
    {
      System.out.println("FizzBuzz");
    }
    else
    {
      System.out.println(num);
    }
  }
  //
  //    NOTE: this is a kata (higher level instructions)
  //    part of the exercise is to translate into line-by-line English, THEN Java
  //
  //    For more complete directions see this page
  //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
}
