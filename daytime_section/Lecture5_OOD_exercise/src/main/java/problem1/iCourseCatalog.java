package problem1;

public interface iCourseCatalog{
  iCourseCatalog add(Course newCourse);
  iCourseCatalog remove(Course courseToRemove) throws CourseNotFoundException;
  Boolean contains(Course searchedCourse);
  Integer getNumCourse ();
  Course getCourse(int courseIndex) throws InvalidIndexException;
  Boolean isEmpty();
  String toString();
}
