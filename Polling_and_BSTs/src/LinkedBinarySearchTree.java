/** A generic binary search tree implementation that stores elements of type E.
 * @param <E> The type of elements stored in the tree, which must implement Comparable.
 */
public class LinkedBinarySearchTree<E extends Comparable<E>> implements BinarySearchTree<E> {

    private E rootElement;
    private LinkedBinarySearchTree<E> leftsubtree;
    private LinkedBinarySearchTree<E> rightsubtree;
    private int count ;

    /** Constructs an empty LinkedBinarySearchTree.*/
    public LinkedBinarySearchTree() {
        rootElement = null;
        leftsubtree = null;
        rightsubtree = null;
        count = 0;
    }
    /** Constructs a LinkedBinarySearchTree with the specified root element.
     * @param rootElement The root element of the tree.
     */
    public LinkedBinarySearchTree(E rootElement) {
        this.rootElement = rootElement;
        leftsubtree = new LinkedBinarySearchTree<E>();
        rightsubtree = new LinkedBinarySearchTree<E>();
        count++;
    }
    /**
     * Gets the root element of the tree.
     * @return The root element of the tree.
     */
    public E getRootElement() {
        return rootElement;
    }
    /**
     * Checks if the tree is empty.
     * @return true if the tree is empty, false otherwise.
     */
    public boolean isEmpty() {
        return rootElement == null;
    }
    /**
     * Gets the number of elements in the tree.
     * @return The number of elements in the tree.
     */
    public int size() {
        return count;
    }

    /**
     * Checks if the tree contains the specified element.
     * @param element The element to check for.
     * @return true if the element is found in the tree, false otherwise.
     */
    public boolean contains(E element) {
        if (isEmpty()) {
            return false;
        } else if (rootElement.compareTo(element) == 0) {
            return true;
        } else if (rootElement.compareTo(element) < 0) {     // If the element is greater than the current node, search in the right subtree
            if (rightsubtree == null)
                return false; // Right subtree is empty, the element is not found
            return rightsubtree.contains(element);
        }
        else {
            // If the element is smaller than the current node, search in the left subtree
            if (leftsubtree == null)
                return false; // Left subtree is empty, the element is not found
            return leftsubtree.contains(element);
        }
    }
    /**
     * Inserts an element into the binary search tree. If the element is already present,
     * the tree's count of elements is incremented.
     * @param element The element to insert.
     */
    public void insert(E element) {
        // Check if the element already exists in the tree
        if (this.contains(element)) {
            // If it exists, increment the count and do not insert a duplicate
            count++;
        } else {
            // If the tree is empty, set the element as the root
            if (isEmpty()) {
                this.rootElement = element;
            } else {
                // Compare the element with the current root
                int comparison = element.compareTo(rootElement);
                if (comparison < 0) {
                    // If the element is smaller, insert it into the left subtree
                    if (leftsubtree == null) {
                        leftsubtree = new LinkedBinarySearchTree<E>();
                    }
                    leftsubtree.insert(element);
                } else if (comparison > 0) {
                    // If the element is greater, insert it into the right subtree
                    if (rightsubtree == null) {
                        rightsubtree = new LinkedBinarySearchTree<E>();
                    }
                    rightsubtree.insert(element);
                } else {
                    // If the element is equal to the current root, update the root
                    rootElement = element;
                }
            }
        }
    }

    /**
     * Generates a string representation of the binary search tree, including
     * pre-order, in-order, and post-order traversals.
     * @return A formatted string containing pre-order, in-order, and post-order traversals of the tree.
     */
    public String toString() {
        String preOrder = "Pre: " + toStringPreOrder() + "\n";
        String inOrder = "In: " + toStringInOrder() + "\n";
        String postOrder = "Post: " + toStringPostOrder();
        return "Tree:\n" + preOrder + inOrder + postOrder;
    }
    /**
     * Returns a string representation of the tree in pre-order traversal.
     * @return A string containing elements of the tree in pre-order.
     */
    public String toStringPreOrder() {
        StringBuilder result = new StringBuilder();
        preOrderTraversalHelper(result);
        return result.toString();
    }
    /**
     * Performs a pre-order traversal of the binary search tree, appending each
     * visited element to the given StringBuilder.
     * @param result The StringBuilder to which the elements are appended during pre-order traversal.
     */
    private void preOrderTraversalHelper(StringBuilder result) {
        if (!isEmpty()) {
            result.append(rootElement.toString() + " ");
            // Recursively traverse the left subtree
            if (leftsubtree != null) {
                leftsubtree.preOrderTraversalHelper(result);
            }
            // Recursively traverse the right subtree
            if (rightsubtree != null) {
                rightsubtree.preOrderTraversalHelper(result);
            }
        }
    }
    /**
     * Returns a string representation of the tree in post-order traversal.
     * @return A string containing elements of the tree in post-order.
     */
    public String toStringPostOrder() {
        StringBuilder result = new StringBuilder();
        postOrderTraversalHelper(result);
        return result.toString();
    }

    /**
     * Performs a post-order traversal of the binary search tree, appending each
     * visited element to the given StringBuilder.
     * @param result The StringBuilder to which the elements are appended during
     * post-order traversal.
     */
    private void postOrderTraversalHelper(StringBuilder result) {
        if (!isEmpty()) {
            // Recursively traverse the left subtree
            if (leftsubtree != null) {
                leftsubtree.postOrderTraversalHelper(result);
            }
            // Recursively traverse the right subtree
            if (rightsubtree != null) {
                rightsubtree.postOrderTraversalHelper(result);
            }
            // Append the current node's element to the result
            result.append(rootElement.toString() + " ");
        }
    }
    /**
     * Returns a string representation of the tree in in-order traversal.
     * @return A string containing elements of the tree in in-order.
     */
    public String toStringInOrder() {
        StringBuilder result = new StringBuilder();
        inOrderTraversalHelper(result);
        return result.toString();
    }

    /**
     * Performs an in-order traversal of the binary search tree, appending each
     * visited element to the given StringBuilder.
     * @param result The StringBuilder to which the elements are appended during
     * in-order traversal.
     */
    private void inOrderTraversalHelper(StringBuilder result) {
        if (!isEmpty()) {
            // Recursively traverse the left subtree
            if (leftsubtree != null) {
                leftsubtree.inOrderTraversalHelper(result);
            }
            // Append the current node's element to the result
            result.append(rootElement.toString() + " ");
            // Recursively traverse the right subtree
            if (rightsubtree != null) {
                rightsubtree.inOrderTraversalHelper(result);
            }
        }
    }

}
