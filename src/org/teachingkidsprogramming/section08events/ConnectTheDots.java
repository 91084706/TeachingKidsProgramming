package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    setUpTheWindow();
    prepareColorPalette();
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //    Listen for right clicks on the window for the tortoise  --#20.2
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //    addDot at x and y (recipe below) --#5
    addDot(x, y);
  }
  private void addDot(int x, int y)
  {
    //    ------------- Recipe for addDot --#6
    createCircle(x, y);
    //    Move the tortoise to the current position of the mouse (x,y) --#4
    Tortoise.moveTo(x, y);
    //    ------------- End of addDot Recipe 
    //    Uncomment to write the text "Right click to clear the window" on the screen at position 100, 100 --#8
    new Text("Right click to clear the window").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  public void createCircle(int x, int y)
  {
    //           Create a new circle with a radius of 11 using the next color on the color wheel 
    int radius = 11;
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    //           Change the circle to be 60% opaque 
    circle.setTransparency(60);
    //           Move the circle so that it's center is at the current position of the mouse (x,y) 
    circle.setCenter(x, y);
    //           Place the circle on the tortoise's window 
    circle.addTo(Tortoise.getBackgroundWindow());
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    Clear everything from the window HINT: Use Tortoise --#7
    Tortoise.clear();
  }
  private static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}
