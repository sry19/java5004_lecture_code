package linkedList;

// Linked list Node.

public class Node {

  protected Integer data;
  protected Node next;

  // Constructor
  public Node(Integer data)
  {
    this.data = data;
    this.next = null;
  }

  public Integer getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }
}