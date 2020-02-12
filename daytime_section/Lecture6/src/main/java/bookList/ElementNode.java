package bookList;
/**
 * This represents a non-empty node of the list. It contains a piece of data
 * along with the rest of the list
 */
public class ElementNode implements IListOfBooks {
  private Book book;
  private IListOfBooks rest;

  public ElementNode(Book p,IListOfBooks rest) {
    this.book = p;
    this.rest = rest;
  }

  @Override
  public int count() { return 1+this.rest.count();}

  @Override
  public float totalPrice() { return this.book.getPrice() + this.rest
          .totalPrice();}

  @Override
  public IListOfBooks allBefore(int year) {
    if (book.before(year)) {
      return new ElementNode(this.book,this.rest.allBefore(year));
    }
    else {
      return this.rest.allBefore(year);
    }
  }

  @Override
  public IListOfBooks sortByPrice() {
    return this.rest.sortByPrice().insert(this.book);
  }

  @Override
  public IListOfBooks insert(Book book) {
    if (this.book.cheaperThan(book)) {
      return new ElementNode(this.book,this.rest.insert(book));
    }
    else {
      return new ElementNode(book,this);
    }
  }

  @Override
  public String toString() {
    return "("+this.book.toString()+")"+this.rest.toString();
  }

  @Override
  public IListOfBooks addFront(Book book) {
    return new ElementNode(book,this);
  }

  @Override
  public IListOfBooks addBack(Book book) {
    this.rest = this.rest.addBack(book);
    return this;
  }

  @Override
  public IListOfBooks add(int index,Book book) {
    if (index==0) {
      return addFront(book);
    }
    else {
      this.rest = this.rest.add(index-1,book);
      return this;
    }
  }

  @Override
  public IListOfBooks remove(Book book) {
    if (this.book.sameBook(book)) {
      return this.rest;
    }
    else {
      this.rest = this.rest.remove(book);
      return this;
    }
  }

  @Override
  public Book get(int index) throws IllegalArgumentException{
    if (index==0) return this.book;
    return this.rest.get(index-1);
  }
}
