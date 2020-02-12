package linkedlist;

public class EmptyNode implements ILinkedList {
    public EmptyNode() {
    }

    /**
     * Gets the number of elements in the list.
     *
     * @return THe number of elements in the list.
     */
    @Override
    public Integer count() {
        return 0;
    }

    /**
     * Get the item at the head of the list.
     *
     * @return The integer at the head of the list or null if the list is empty.
     */
    @Override
    public Integer getItem() {
        return null;
    }

    /**
     * Get the rest of the list.
     *
     * @return The rest of the list or null if the list is empty.
     */
    @Override
    public ILinkedList getRest() {
        return null;
    }

    /**
     * Inserts an element at the head of the list.
     *
     * @param item The item to insert.
     * @return The linked list with the new item at the head.
     */
    @Override
    public ILinkedList insert(Integer item) {
        return new ElementNode(item, this);
    }

    /**
     * Inserts an element at the specified index.
     *
     * @param item  The item to insert.
     * @param index The index to insert at.
     * @return The linked list with the new item inserted.
     * @throws IndexOutOfBoundsException If the specified index is out of bounds.
     */
    @Override
    public ILinkedList insertAt(Integer item, Integer index) throws IndexOutOfBoundsException {
        if (!index.equals(0))
            throw new IndexOutOfBoundsException();
        else
            return new ElementNode(item, this);
    }

    @Override
    public int hashCode() {
        return 47;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "EmptyNode{}";
    }
}
