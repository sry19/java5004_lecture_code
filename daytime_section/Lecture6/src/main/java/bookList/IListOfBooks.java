package bookList;

/**
 * This interface represents all the operations to be supported by a list of
 * books
 */
public interface IListOfBooks {
  /**
   * Return the number of books in this list
   * @return the size of this list
   */
  int count();

  /**
   * Return the total price of all books in this list
   * @return the total price of all books
   */
  float totalPrice();

  /**
   * Return a list of all books within this list that are published before
   * the given year
   * @param year the year before which all the returned books are published
   * @return the list of all books published before the given year
   */
  IListOfBooks allBefore(int year);

  /**
   * Return a sorted list of books in increasing order of price
   * @return a sorted list of book
   */
  IListOfBooks sortByPrice();

  /**
   * Return a list obtained by adding the specified book in the
   * @param book
   * @return
   */
  IListOfBooks insert(Book book);

  /**
   * Create and return a string that can be used to print this list
   * @return
   */
  String toString();

  //added later for the ADT

  /**
   * Add the given book to the front of this list and return this modified list
   * @param b the book to be added
   * @return the resulting list
   */
  IListOfBooks addFront(Book b);

  /**
   * Add the given book to the back of this list and return this modified list
   * @param b the book to be added
   * @return the resulting list
   */
  IListOfBooks addBack(Book b);

  /**
   * A method that adds the given book at the given index in this list
   * . If index is 0, it means this book should be added to the front of this
   * list
   * @param index the position to be occupied by this book, starting at 0
   * @param b the book to be added
   * @return the resulting list
   * @throws IllegalArgumentException if an invalid index is passed
   */
  IListOfBooks add(int index, Book b) throws IllegalArgumentException;

  /**
   * Remove the first instance of this book from the list
   * @param b the book to be removed
   * @return
   */
  IListOfBooks remove(Book b);

  /**
   * Get the book at the specified index, with 0 meaning the first book in
   * this list
   * @param index the specified index
   * @return the book at the specified index
   * @throws IllegalArgumentException if an invalid index is passed
   */
  Book get(int index) throws IllegalArgumentException;
}
