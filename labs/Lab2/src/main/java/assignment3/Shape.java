package assignment3;

/**
 * This interface contains all operations that all types of shapes
 * should support.
 */
public interface Shape {

  /**
   * Computes and returns the area of this shape.
   * @return the area of the shape
   */
  double area();

  /**
   * Computes and returns the perimeter of this shape.
   * @return the perimeter of the shape
   */
  double perimeter();

  /**
   * Create and return a shape of the same kind as this one, resized
   * in area by the provided factor.
   * @param factor factor of resizing
   * @return the resized Shape
   */
  Shape resize(double factor);
}