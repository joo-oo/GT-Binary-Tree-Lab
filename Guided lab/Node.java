/**
 * This class is the blueprint for a single node in our Binary Tree.
 */
public class Node {
    // 1. DATA: What information does the node hold?
    String data;

    // 2. REFERENCES: Pointers to other nodes
    Node left;   // Represents the "No" path
    Node right;  // Represents the "Yes" path

    /**
     * This is the CONSTRUCTOR. It's a special method that runs when you
     * create a new Node object using the `new` keyword. Its job is to
     * set up the object's initial state.
     */
    public Node(String data) {
        // 'this.data' refers to the 'data' variable of THIS specific object.
        // The other 'data' is the one passed into the method.
        this.data = data;

        // When a node is first created, it has no children.
        // 'null' is a special Java keyword that means "nothing" or "no object".
        this.left = null;
        this.right = null;
    }
}