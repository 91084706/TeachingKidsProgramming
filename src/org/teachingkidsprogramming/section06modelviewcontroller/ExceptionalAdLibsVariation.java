package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;
import org.teachingkidsprogramming.section06modelviewcontroller.AdLibsRtf.Words;

public class ExceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    Words word = new Words();
    String adverb = askAdverb();
    String edverb = askEdVerb();
    String bodyPart = askBodyPart();
    Parser.parseRtfFile("view.rtf", word);
    String currentStory = MessageBox.askForTextInput("Today I woke up " + adverb + ". ");
    currentStory = currentStory + "Then I " + edverb + " ";
    currentStory = currentStory + "my " + bodyPart + " ";
    Viewer.displayRtfFile(currentStory);
  } // end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.askForTextInput("Try again");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*")) // regex = regular expression
    {
      MessageBox.askForTextInput("Numbers are NOT adverbs, try again.");
      askAdverb();
    }
    return adverb;
  } // end of method
  private static String askEdVerb()
  {
    String edverb = MessageBox.askForTextInput("Enter a verb ending with -ed: ");
    if (edverb.isEmpty())
    {
      MessageBox.askForTextInput("Try again");
      askEdVerb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.askForTextInput("Numbers are NOT edverbs, try again.");
      askEdVerb();
    }
    return edverb;
  }
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if (bodyPart.isEmpty())
    {
      MessageBox.askForTextInput("Try again");
      askBodyPart();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.askForTextInput("Numbers are not body parts, try again.");
      askBodyPart();
    }
    return bodyPart;
  }
} // end of class
