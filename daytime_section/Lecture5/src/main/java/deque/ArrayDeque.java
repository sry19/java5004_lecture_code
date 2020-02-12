package deque;

public class ArrayDeque implements Deque {
  private Integer[] deque = new Integer[100];

  @Override
  public void addFirst(Integer newFirst) {

  }

  @Override
  public void addLast(Integer newLast) {

  }

  @Override
  public void removeFirst() throws EmptyDequeException {
    if(deque.length == 0)
      throw new EmptyDequeException();
    else {
      for (int i = 1; i <= this.deque.length -1; i++){
        this.deque[i - 1] = this.deque[i];
      }
    }
  }

  @Override
  public void removeLast() throws EmptyDequeException {
    if(deque.length == 0)
      throw new EmptyDequeException();
    else {
      this.deque[this.deque.length - 1] = null;
    }
  }

  @Override
  public Integer peekFirst() throws EmptyDequeException {
    if(deque.length == 0)
      throw new EmptyDequeException();
    else {
      return deque[0];
    }
  }

  @Override
  public Integer peekLast() throws EmptyDequeException {
    if(deque.length == 0)
      throw new EmptyDequeException();
    else {
      return deque[this.deque.length - 1];
    }
  }
}
