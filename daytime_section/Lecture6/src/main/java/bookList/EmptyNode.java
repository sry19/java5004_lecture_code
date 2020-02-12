package bookList;
/**
 * This represents an empty node in the list
 */
public class EmptyNode implements IListOfBooks {

  @Override
  public int count(){return 0;}

  @Override
  public float totalPrice() {return 0.0f;}

  @Override
  public IListOfBooks allBefore(int year) { return new EmptyNode();}

  @Override
  public IListOfBooks sortByPrice() { return new EmptyNode();}

  @Override
  public IListOfBooks insert(Book book) { return new ElementNode(book,this);}

  @Override
  public String toString() { return "";}

  @Override
  public IListOfBooks addFront(Book book) {return new ElementNode(book,this);}

  @Override
  public IListOfBooks addBack(Book book) { return addFront(book);}

  @Override
  public IListOfBooks add(int index,Book book) throws IllegalArgumentException {
    if (index==0){
      return addFront(book);
    }
    throw new IllegalArgumentException("Invalid index to add an element");
  }

  @Override
  public IListOfBooks remove(Book b) {
    return this; //cannot remove from nothing!
  }

  @Override
  public Book get(int index) throws IllegalArgumentException {
    throw new IllegalArgumentException("Wrong index");
  }
}
