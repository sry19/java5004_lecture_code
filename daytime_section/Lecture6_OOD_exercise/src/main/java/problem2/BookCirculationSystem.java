package problem2;

/*
 * Abstract class BookCirculationSystem implements
 * an interface iBookCirculationSystem.
 */
public abstract class BookCirculationSystem implements iBookCirculationSystem {

  @Override
  public iBookCirculationSystem addBook(Book bookToAdd) {
    if(!bookToAdd.equals(null))
      return (iBookCirculationSystem) new NonEmptySystem(bookToAdd, this);
    else
      return this;
  }
}
