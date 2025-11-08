/**
 * This class is the blueprint for the entire Binary Tree.
 * It manages all the nodes by holding a reference to the root node.
 */
public class BinaryTree {
    // The starting point of our tree.
    Node root;

    /**
     * This is a public method that anyone can call to start the traversal.
     * It calls a private helper method that does the complex recursive work.
     * This hides the complexity from the user.
     */
    public void traversePreOrder() {
        System.out.println("\n--- Pre-Order Traversal (Root -> Left -> Right) ---");
        // Start the real traversal from the root node
        traversePreOrderRecursive(root);
        System.out.println(); // Add a new line for clean output
    }

    /**
     * This is a private helper method. It does the "real" work of traversing.
     * It uses RECURSION, which means the method calls itself.
     */
    private void traversePreOrderRecursive(Node node) {
        // Base Case: This is the most important part of recursion.
        // It's the condition that STOPS the process.
        if (node == null) {
            return; // Stop if we've reached an empty spot (a null child).
        }

        // 1. Visit the current node (print its data)
        System.out.print(node.data + " -> ");
        // 2. Recursively traverse the left subtree
        traversePreOrderRecursive(node.left);
        // 3. Recursively traverse the right subtree
        traversePreOrderRecursive(node.right);
    }


    public void traverseInOrder() {
        System.out.println("\n--- In-Order Traversal (Left -> Root -> Right) ---");

        traverseInOrderRecursive(root);
        System.out.println();
    }

    private void traverseInOrderRecursive(Node node) {

        if (node == null) {
            return;
        }

        traverseInOrderRecursive(node.left);

        System.out.print(node.data + " -> ");

        traverseInOrderRecursive(node.right);
    }

    public void traversePostOrder() {
        System.out.println("\n--- Post-Order Traversal (Left -> Right -> Root) ---");

        traversePostOrderRecursive(root);
        System.out.println();
    }

    private void traversePostOrderRecursive(Node node) {

        if (node == null) {
            return;
        }

        traversePostOrderRecursive(node.left);

        traversePostOrderRecursive(node.right);

        System.out.print(node.data + " -> ");
    }


}
























