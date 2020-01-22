package problem3;

/**
 * This class represents a rectangle.  It defines all the operations mandated by
 * the problem3.Shape interface
 */
public class Rectangle extends AbstractShape {
  private double width, height;

  /**
   * Constructs a rectangle object with the given location of its lower-left
   * corner and dimensions
   *
   * @param x      x coordinate of the lower-left corner of this rectangle
   * @param y      y coordinate of the lower-left corner of this rectangle
   * @param width  width of this rectangle
   * @param height height of this rectangle
   */
  public Rectangle(double x, double y, double width, double height) throws NegativeSidesException {
    super(new Point2D(x, y));

    if (width > 0 && height > 0) {
      this.width = width;
      this.height = height;
    } else throw new NegativeSidesException("Height and width are not set properly!");
  }

  @Override
  public double area() {
    return this.width * this.height;
  }

  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    try {
      return new Rectangle(
          this.reference.getX(),
          this.reference.getY(), sqrtFactor *
          this.width,
          sqrtFactor * this.height);
    } catch (NegativeSidesException e) {
      e.printStackTrace();
    }
  }

  public String toString() {
    return String.format("problem3.Rectangle: LL corner (%.3f,%.3f) width %.3f height " +
            "%.3f",
        this.reference.getX(), this.reference.getY(), this.width, this
            .height);
  }
}