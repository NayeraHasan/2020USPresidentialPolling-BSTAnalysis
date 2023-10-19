/**
 * The BinarySearchTree interface represents a binary search tree data structure.
 * @param <E> The type of elements that can be stored in the binary search tree.
 */
public interface BinarySearchTree<E extends Comparable<E>> {

    /**
     * Inserts an element into the binary search tree.
     * @param element The element to insert.
     */
    void insert(E element);

    /**
     * Gets the root element of the binary search tree.
     * @return The root element of the tree.
     */
    E getRootElement();

    /**
     * Gets the number of elements in the binary search tree.
     * @return The number of elements in the tree.
     */
    int size();

    /**
     * Checks if the binary search tree is empty.
     * @return true if the tree is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns a string representation of the binary search tree in in-order traversal.
     * @return A string containing elements of the tree in in-order.
     */
    String toStringInOrder();

    /**
     * Returns a string representation of the binary search tree in pre-order traversal.
     * @return A string containing elements of the tree in pre-order.
     */
    String toStringPreOrder();

    /**
     * Returns a string representation of the binary search tree in post-order traversal.
     * @return A string containing elements of the tree in post-order.
     */
    String toStringPostOrder();
}
