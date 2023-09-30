package ModelEliments;

import Stuff.Angle3D;
import Stuff.Color;
import Stuff.Point3D;

public class Flash {
  public Point3D location;
  public Angle3D angle;
  public Color color;
  public Float power;

  public void rotate(Angle3D element) {

    System.out.println("Вращать элемент");

  }

  public void move(Point3D element) {

    System.out.println("Переместить элемент");

  }

}
