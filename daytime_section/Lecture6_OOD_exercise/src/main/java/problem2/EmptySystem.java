package problem2;

/*
 * Class EmptySystem represents a base case in the recursive implementation of
 */
public class EmptySystem extends BookCirculationSystem {

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public iBookCirculationSystem removeBook(Book bookToRemove) throws BookNotFoundException {
    throw new BookNotFoundException("Book circulation system is empty!");
  }

  @Override
  public Boolean containsBook(Book bookToFind) {
    return false;
  }

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Book getRandomBook() {
    return null;
  }

  @Override
  public Book getBookbyISBN(String ISBN) throws InvalidISBNException {
    throw new InvalidISBNException("A book with the given ISBN doesn't exist in the system!");
  }
}
