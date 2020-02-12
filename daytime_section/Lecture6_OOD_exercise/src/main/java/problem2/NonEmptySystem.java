package problem2;

/*
 * Class NonEmptySystem represents a non-empty case in the recursive implementation of
 */
public class NonEmptySystem extends BookCirculationSystem{
  private Book firstBook;
  private iBookCirculationSystem restOfTheSystem;

  /*
   * Constructor for the non-empty book circulation system. New NonEmptySystem is created based upon
   * the provided input arguments.
   * @param bookToAdd - new book to add as the first element in the circulation system, represented
   * as a Book
   * @param bookCirculationSystem - the rest of the book circulation system
   */
  public NonEmptySystem(Book bookToAdd, iBookCirculationSystem bookCirculationSystem) {
    this.firstBook = bookToAdd;
    this.restOfTheSystem = bookCirculationSystem;
  }

  /*
   * Getter for the firstBook, represented as a Book.
   * @return - first book in the system, represented as a Book
   */
  public Book getFirstBook() {
    return firstBook;
  }

  /*
   * Setter for the firstBook, represented as a Book.
   * @param firstBook - first book in the system, represented as a Book
   */
  public void setFirstBook(Book firstBook) {
    this.firstBook = firstBook;
  }

  /*
   * Getter for the rest of the book circulation system.
   * @return restOfTheSystem - rest of the book circulation system, represented as a
   * iBookCirculationSystem
   */
  public iBookCirculationSystem getRestOfTheSystem() {
    return restOfTheSystem;
  }

  /*
   * Setter for the rest of the book circulation system.
   * @param restOfTheSystem - rest of the book circulation system, represented as a
   * iBookCirculationSystem
   */
  public void setRestOfTheSystem(iBookCirculationSystem restOfTheSystem) {
    this.restOfTheSystem = restOfTheSystem;
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Integer size() {
    return 1 + this.restOfTheSystem.size();
  }

  @Override
  /*
   * Method getRandomBook returns the last method from the book circulation system.
   * @return - the last book from the book circulation system, represented as a Book
   */
  public Book getRandomBook() {
    if(this.getRestOfTheSystem().isEmpty())
      return this.firstBook;
    else
      return this.getRestOfTheSystem().getRandomBook();
  }

  @Override
  public Boolean containsBook(Book bookToFind) {
    if (this.firstBook.equals(bookToFind))
      return true;
    else return this.restOfTheSystem.containsBook(bookToFind);
  }

  @Override
  public Book getBookbyISBN(String ISBN) throws InvalidISBNException {
    if (this.firstBook.getISBN().equals(ISBN))
      return this.firstBook;
    else return this.restOfTheSystem.getBookbyISBN(ISBN);
  }

  @Override
  public iBookCirculationSystem removeBook(Book bookToRemove) throws BookNotFoundException {
    if (this.firstBook.equals(bookToRemove))
      return this.restOfTheSystem;
    else
      return new NonEmptySystem(this.firstBook, this.restOfTheSystem.removeBook(bookToRemove));
  }
}
