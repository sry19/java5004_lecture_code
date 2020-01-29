package linkedList;

import ListELement.ListElement;

public class LinkedList2 implements List {

  private ListElement first;

  public LinkedList2(ListElement first) {
    this.first = first;
  }

  @Override
  public void insertElement(Integer elem, Integer position) {

  }

  @Override
  public void printList() {

  }

  @Override
  public Integer size() {
    Integer size = 0;

    while(this.first.getNext() != null){
      size = size++;
      this.first = this.first.getNext();
    }

  }
}
