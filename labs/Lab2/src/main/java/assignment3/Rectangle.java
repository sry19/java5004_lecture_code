package assignment3;

import java.util.Objects;

/**
 * This class represents a rectangle.  It defines all the operations mandated by the Shape
 * interface
 */
public class Rectangle extends AbstractShape {

  private double width;
  private double height;

  /**
   * Constructs a rectangle object with the given location of its lower-left corner and dimensions.
   *
   * @param xpoint x coordinate of the lower-left corner of this rectangle
   * @param ypoint y coordinate of the lower-left corner of this rectangle
   * @param width width of this rectangle
   * @param height height of this rectangle
   * @throws InvalidDimensionsException if a non-positive width or non-positive height is passed
   */
  public Rectangle(double xpoint, double ypoint, double width, double height)
      throws InvalidDimensionsException {
    super(new Point2D(xpoint, ypoint));

    if (width <= 0) {
      throw new InvalidDimensionsException("Width should not be zero or negative.");
    }

    if (height <= 0) {
      throw new InvalidDimensionsException("Height should not be zero or negative.");
    }

    this.width = width;
    this.height = height;
  }

  /**
   * Return the rectangle's area.
   *
   * @return the rectangle's area.
   */
  @Override
  public double area() {
    return this.width * this.height;
  }

  /**
   * Return the rectangle's perimeter.
   *
   * @return the rectangle's perimeter.
   */
  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }

  /**
   * Return a new rectangle that is at the same location as the original rectangle, but whose length
   * and height are multiplied by the square root of the factor passed as an argument.
   *
   * @param factor factor of resizing
   * @return a new rectangle that is at the same location as the original rectangle, but whose
   *        length and height are multiplied by the square root of hte factor passed as an argument
   * @throws InvalidFactorException if a non-positive factor is passed as an argument
   */
  @Override
  public Shape resize(double factor) throws InvalidFactorException {
    if (factor <= 0) {
      throw new InvalidFactorException("Factor is non-positive.");
    }
    double sqrtFactor = Math.sqrt(factor);
    return new Rectangle(
        this.reference.getXpoint(),
        this.reference.getYpoint(),
        sqrtFactor * this.width,
        sqrtFactor * this.height);
  }

  /**
   * Return a string that is formatted in such a way that it says the rectangle's lower-left corner
   * position as well as its width and height to 3 decimal places.
   *
   * @return a string formatted as described above.
   */
  @Override
  public String toString() {
    return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height "
            + "%.3f",
        this.reference.getXpoint(), this.reference.getYpoint(), this.width, this
            .height);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) obj;
    return Double.compare(rectangle.width, width) == 0
        && Double.compare(rectangle.height, height) == 0;
  }

  @Override
  public int hashCode() {

    return Objects.hash(width, height);
  }
}