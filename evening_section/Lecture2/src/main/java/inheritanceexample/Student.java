package inheritanceexample;

/**
 * A mutable class representing a student. Student is a subclass of Person.
 */
public class Student extends Person {
  private String[] courses;

  /**
   * Constructor for the Student class.
   * @param firstName The student's first name, a String.
   * @param lastName The student's last name, a String.
   * @param courses The courses the student is currently taking, a String array.
   */
  public Student(String firstName, String lastName, String[] courses) {
    super(firstName, lastName);
    this.courses = courses;
  }

  /**
   * Gets the array of courses the student is taking.
   * @return The array of courses the student is taking, a String array.
   */
  public String[] getCourses() {
    return this.courses;
  }

  /**
   * Checks if the student is taking a particular course.
   * @param course The course to check for, a String.
   * @return True if the course is in the student's course list, false otherwise.
   */
  public boolean isTakingCourse(String course) {
    for (String current: this.courses) {
      if (current.equals(course))
        return true;
    }
    return false;
  }

}
