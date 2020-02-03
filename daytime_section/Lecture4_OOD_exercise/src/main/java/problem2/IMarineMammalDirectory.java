package problem2;

/*
 *Interface IMarineMammalDirectory represents an ADT for a NonEmptyMarineMammalDirectory.
 */
public interface IMarineMammalDirectory {

  /*
   *Method createEmpty() creates an empty NonEmptyMarineMammalDirectory.
   * @return - a new empty NonEmptyMarineMammalDirectory
   */
  IMarineMammalDirectory createEmpty();

  /*
   * Method add the provided mammal into the existing directory.
   * If the mammal is already in the directory, the directory remains unchanged.
   * @param mammal - a marine mammal to be added to the directory
   * @return - the updated NonEmptyMarineMammalDirectory
   */
  IMarineMammalDirectory add(MarineMammal mammal);

  /*
   *Method returns true if the NonEmptyMarineMammalDirectory is empty, and false otherwise
   * @return - a Boolean flag to indicate if the directory is empty.
   */
  Boolean isEmpty();

  /*
   *Method return the size of the NonEmptyMarineMammalDirectory. 
   *If the directory is empty, method returns 0.
   */
  Integer size();

  /*
   *Method returns true if the provided mammal exists in the NonEmptyMarineMammalDirectory, 
   *and false otherwise
   * @param mammal - a mammal to be searched for in the directory
   * @return - a Boolean flag to indicate whether or not the mammal exists in the directory
   */
  Boolean contains(MarineMammal mammal);

  /*
   *Method removes the provided mammal from the directory. 
   *If the mammal does not exist in the directory, the method returns an unchanged directory.
   * @param mammal - a mammal to be removed from the directory
   * @return - the updated NonEmptyMarineMammalDirectory
   */
  IMarineMammalDirectory remove(MarineMammal mammal);

  /*
   *Method returns a random mammal from the directory.
   * @return - a random mammal from the directory
   */
  MarineMammal getMammal();
}
