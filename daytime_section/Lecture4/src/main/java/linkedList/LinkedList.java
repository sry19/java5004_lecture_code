package linkedList;

import java.io.*;

public class LinkedList implements List{

  Node head; // head of list


  // Method to insert a new node
  @Override
  public void insertElement(Integer element)  {
    // Create a new node with given data
    Node newNode = new Node(element);
    newNode.next = null;

    // If the Linked List is empty,
    // then make the new node as head
    if (this.head == null) {
      this.head = newNode;
    }
    else {
      // Else traverse till the last node
      // and insert the new_node there
      Node last = this.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new_node at last node
      last.next = newNode;
    }
  }

  @Override
  public  void printList() {
    Node currNode = this.head;

    System.out.print("LinkedList: ");

    // Traverse through the LinkedList
    while (currNode != null) {
      // Print the data at current node
      System.out.print(currNode.data + " ");

      // Go to next node
      currNode = currNode.next;
    }
  }

  @Override
  public Integer size() {
    //Method not implemented
    return null;
  }
}