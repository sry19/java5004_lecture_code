package assignment3;

/**
 * This class represents a 2D point. This point is denoted in Cartesian
 * coordinates as (xpoint,ypoint).
 */
public class Point2D {
  private double xpoint;
  private double ypoint;

  /**
   * Construct a 2d point with the given coordinates.
   *
   * @param xpoint the xpoint-coordinate of this point
   * @param ypoint the ypoint-coordinate of this point
   */
  public Point2D(double xpoint, double ypoint) {
    this.xpoint = xpoint;
    this.ypoint = ypoint;
  }

  /**
   * Compute and return the Euclidean distance of this point to the origin.
   *
   * @return the euclidean distance
   */

  public double distToOrigin() {
    return Math.sqrt(xpoint * xpoint + ypoint * ypoint);
  }

  /**
   * Return the xpoint-coordinate of this point.
   *
   * @return xpoint-coordinate of this point
   */
  public double getXpoint() {
    return xpoint;
  }

  /**
   * Return the ypoint-coordinate of this point.
   *
   * @return ypoint-coordinate of this point
   */
  public double getYpoint() {
    return ypoint;
  }
}