class BinarySearchTreeTest {
    public static void main(String[] args) {
        testInteger(new LinkedBinarySearchTree<Integer>());
        testCharacter(new LinkedBinarySearchTree<Character>());
        System.out.println("If we get here without any error messages, BST self-checks passed");
    }
    private static void testInteger(BinarySearchTree<Integer> initiallyEmptyIntTree) {
        BinarySearchTree<Integer> intTree = initiallyEmptyIntTree;  // intTree now "paired with" the original tree
        assert(intTree.isEmpty());
        System.out.println("Beginning BST self-checks for integers");

        intTree.insert(8);
        intTree.insert(11);
        intTree.insert(5);
        intTree.insert(17);
        intTree.insert(1);
        intTree.insert(9);
        intTree.insert(3);
        System.out.println("My preorder result is");
        System.out.println(intTree.toStringPreOrder());
        System.out.println(intTree.size());
        //System.out.println("The correct answer is 8 5 1 3 11 9 17");
        System.out.println("My inorder result is");
        System.out.println(intTree.toStringInOrder());

    }

    private static void testCharacter(BinarySearchTree<Character> initiallyEmptyCharacterTree) {
        if (initiallyEmptyCharacterTree == null) {
            System.out.println("testCharacter: need to create a tree for testing!");
        }
        assert(initiallyEmptyCharacterTree != null);
        BinarySearchTree<Character> letterTree = initiallyEmptyCharacterTree;
        assert(letterTree.isEmpty());
        System.out.println("Beginning BST self-checks for characters");

        letterTree.insert('A');
        letterTree.insert('C');
        letterTree.insert('G');
        letterTree.insert('B');
        letterTree.insert('D');
        letterTree.insert('G'); // inserting again, should replace
        letterTree.insert('F');
        letterTree.insert('E');
        letterTree.insert('H');
        letterTree.insert('I');
        System.out.println("The size of my letter tree is");
        System.out.println(letterTree.size());
        //System.out.println("The correct answer is 9");
        System.out.println("My result for preorder is");
        System.out.println(letterTree.toStringPreOrder());
        //System.out.println("The correct answer for preorder is A C B G D F E H I");
        System.out.println("My result for inorder is");
        System.out.println(letterTree.toStringInOrder());
        //System.out.println("The correct answer for inorder is A B C D E F G H I");
        System.out.println("My result for postorder is");
        System.out.println(letterTree.toStringPostOrder());
        //System.out.println("The correct answer for postorder is B E F D I H G C A");

    }
}