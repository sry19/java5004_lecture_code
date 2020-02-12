package deque;

public interface Deque {

  void addFirst (Integer newFirst);
  void addLast (Integer newLast);

  void removeFirst() throws EmptyDequeException;
  void removeLast() throws EmptyDequeException;

  Integer peekFirst() throws EmptyDequeException;
  Integer peekLast() throws EmptyDequeException;
}
