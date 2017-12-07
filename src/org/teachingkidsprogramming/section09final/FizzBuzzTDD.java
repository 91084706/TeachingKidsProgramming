package org.teachingkidsprogramming.section09final;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTDD
{
  public static void main(String[] args)
  {
    //   For the numbers being tested, print out either that number, or, 
    //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
    //    If that number is divisible by 3, then print the word 'Fizz', 
    //    If that number is divisible by 5, then print the word 'Buzz', 
    //
    //    Write tests using the Assert object via the TDD style
    //
  }
  //    For more complete directions see this page
  //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  @Test
  public void test1Returns1()
  {
    String result = FizzBuzzTDD.convert(1);
    assertEquals("1", result);
  }
  @Test
  public void test3ReturnsFizz()
  {
    String result = FizzBuzzTDD.convert(3);
    assertEquals("Fizz", result);
  }
  @Test
  public void test5ReturnsBuzz()
  {
    String result = FizzBuzzTDD.convert(5);
    assertEquals("Buzz", result);
  }
  @Test
  public void test15ReturnsFizzBuzz()
  {
    String result = FizzBuzzTDD.convert(15);
    assertEquals("FizzBuzz", result);
  }
  public static String convert(int num)
  {
    if (num % 15 == 0)
      return "FizzBuzz";
    if (num % 3 == 0)
      return "Fizz";
    if (num % 5 == 0)
      return "Buzz";
    return num + "";
  }
}
