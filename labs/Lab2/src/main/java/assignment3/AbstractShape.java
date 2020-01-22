package assignment3;

public abstract class AbstractShape implements Shape {

  protected Point2D reference;

  public AbstractShape(Point2D reference) {
    this.reference = reference;
  }

}
